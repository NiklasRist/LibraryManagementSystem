package at.fhv.librarymanagementsystem.controller.api;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Optional;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AuthApiController {

    private final AuthService authService;

    public AuthApiController(AuthService authService){
        this.authService = authService;
    }

    @PreAuthorize("isAnonymus()")
    @PostMapping("/login")
    public TokenDTO login(@RequestBody LoginDTO loginDTO){
        return authService.login(loginDTO);
    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping("/logout")
    @SecurityRequirement(name=OpenApiConstants.TOKEN_SECURITY_REQUIREMENT)
    public void logout(HttpServletRequest httpServletRequest){
        String token =
                Optional.ofNullable(httpServletRequest.getHeader(AuthConstants.AUTHORIZATION_HEADER))
                        .orElseThrow();

        authService.logout(token);
    }
}
