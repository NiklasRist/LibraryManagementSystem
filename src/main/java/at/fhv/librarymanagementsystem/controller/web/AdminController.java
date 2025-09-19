package at.fhv.librarymanagementsystem.controller.web;

import at.fhv.librarymanagementsystem.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    //GET

    @GetMapping("/profile")
    public ResponseEntity<AdminDTO> getAdmin(@RequestParam String email){}


    //POST

    @PostMapping("/register")
    public ResponseEntity<AdminDTO> registriereAdmin(@RequestBody AdminDTO dto) {

    }


    @PostMapping("/login")
    public ResponseEntity<AdminDTO> getAdmin(@RequestParam String email, @RequestParam String passwort){
    }

    //UPDATE

    @PutMapping("/profile")
    public ResponseEntity<AdminDTO> aktualisiereAdmin(@RequestBody AdminDTO dto){
    }

    //DELETE

    @DeleteMapping("/profile")
    public ResponseEntity<AdminDTO> loescheAdmin(@RequestParam String email, @RequestParam String password){}

    @DeleteMapping("/delete/book")
    public ResponseEntity<AdminDTO> loescheBuch(@RequestParam String titel){}

    @DeleteMapping("/delete/user")
    public ResponseEntity<AdminDTO> loescheNutzer(@RequestParam String email){}

    @DeleteMapping("/delete/author")
    public ResponseEntity<AdminDTO> loescheAutor(@RequestParam String email){}

}
