package at.fhv.librarymanagementsystem.controller.web;

import at.fhv.librarymanagementsystem.service.NutzerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user/")
public class NutzerController {
    private final NutzerService nutzerService;

    public NutzerController(NutzerService nutzerService) {
        this.nutzerService = nutzerService;
    }

    //GET

    @GetMapping("/profile")
    public ResponseEntity<NutzerDTO> getNutzer(@RequestParam String email){}
    

    //POST

    @PostMapping("/register")
    public ResponseEntity<NutzerDTO> registriereNutzer(@RequestBody NutzerDTO dto) {

    }


    @PostMapping("/login")
    public ResponseEntity<NutzerDTO> getNutzer(@RequestParam String email, @RequestParam String passwort){
    }

    //UPDATE

    @PutMapping("/profile")
    public ResponseEntity<NutzerDTO> aktualisiereNutzer(@RequestBody NutzerDTO dto){
    }

    //DELETE

    @DeleteMapping("/profile")
    public ResponseEntity<NutzerDTO> loescheNutzer(@RequestParam String email, @RequestParam String password){}
}

