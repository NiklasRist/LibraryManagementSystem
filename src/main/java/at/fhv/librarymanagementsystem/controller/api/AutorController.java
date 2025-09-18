package at.fhv.librarymanagementsystem.controller.api;

import at.fhv.librarymanagementsystem.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/author")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    //GET

    @GetMapping("/")
    public ResponseEntity<List<AutorDTO>> getAllAutor(){} //TODO: vorname + nachname filter

    @GetMapping("/profile")
    public ResponseEntity<AutorDTO> getAutor(@RequestParam String email){}


    //POST

    @PostMapping("/register")
    public ResponseEntity<AutorDTO> registriereAutor(@RequestBody AutorDTO dto) {

    }


    @PostMapping("/login")
    public ResponseEntity<AutorDTO> getAutor(@RequestParam String email, @RequestParam String passwort){
    }

    //UPDATE

    @PutMapping("/profile")
    public ResponseEntity<AutorDTO> aktualisiereAutor(@RequestBody AutorDTO dto){
    }

    //DELETE

    @DeleteMapping("/profile")
    public ResponseEntity<AutorDTO> loescheAutor(@RequestParam String email, @RequestParam String password){}



}
