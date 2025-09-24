package at.fhv.librarymanagementsystem.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthService {
    private final AuthUserCache authUserCache;
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public AuthService(
            AuthUserCache authUserCache, UserService userService, PasswordEncoder passwordEncoder) {
        this.authUserCache = authUserCache;
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    public TokenDTO login(LoginDTO loginDTO){
        UserResponseWithCredentials userCredentials = userService.getUserCredentialsByUsername(loginDTO.username());

        if(!passwordEncoder.matches(loginDTO.password(), userCredentials.passwordHash())){
            throw new ApplicationAuthenticationException("Password is incorrect");
        }

        String token = UUID.randomUUID().toString();
        UserResponse userResponse = userCredentials.userResponse();
        AuthUser authUser = new AuthUser(userResponse.id(), userResponse.roles());

        authUserCache.login(token, authUser);

        return new TokenDTO(token);
    }

    public void logout(String token){
        authUserCache.logout(token);
    }
}
