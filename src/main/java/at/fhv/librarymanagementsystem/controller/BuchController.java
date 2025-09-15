package at.fhv.librarymanagementsystem.controller;

import at.fhv.librarymanagementsystem.service.BuchService;
import at.fhv.librarymanagementsystem.service.VeroeffentlichungService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api/v1/")
public class BuchController {

    private final BuchService buchService;
    private final VeroeffentlichungService veroeffentlichungService;

    public BuchController(BuchService buchService, VeroeffentlichungService veroeffentlichungService) {
        this.buchService = buchService;
        this.veroeffentlichungService = veroeffentlichungService;
    }

    //GET

    @GetMapping("/")
    public ResponseEntity<List<BuchDTO>> getAllBuecher(){
    }

    @GetMapping("/search")
    public ResponseEntity<List<BuchDTO>> sucheNachBuch(@RequestParam String titel){

    }

    @GetMapping("/search")
    public ResponseEntity<List<BuchDTO>> sucheNachBuch(@RequestParam String titel, @RequestParam String kategorie){

    }

    @GetMapping("/search")
    public ResponseEntity<List<BuchDTO>> sucheNachBuch(@RequestParam String kategorie){

    }


    //POST
    
    @PostMapping("/publish")
    public ResponseEntity<BuchDTO> veroeffentlicheBuch(@RequestParam String isbn, @RequestParam String titel, @RequestParam String beschreibung, @RequestParam List<String> kategorien, @RequestParam boolean verfuegbarkeit, @RequestParam String verlag) {}


    //UPDATE
    public ResponseEntity<BuchDTO> aktualisiereBuch(@RequestParam String isbn, @RequestParam String titel, @RequestParam String beschreibung, @RequestParam List<String> kategorien, @RequestParam boolean verfuegbarkeit, @RequestParam String verlag) {}

    //DELETE

    public ResponseEntity<BuchDTO> loescheBuch(@RequestParam String isbn, @RequestParam String titel, @RequestParam String beschreibung, @RequestParam List<String> kategorien, @RequestParam boolean verfuegbarkeit, @RequestParam String verlag) {}
}
