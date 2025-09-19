package at.fhv.librarymanagementsystem.controller.web;

import at.fhv.librarymanagementsystem.service.BuchService;
import at.fhv.librarymanagementsystem.service.VeroeffentlichungService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
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

    //POST

    @PostMapping("/publish")
    public ResponseEntity<BuchDTO> veroeffentlicheBuch(@RequestParam String isbn, @RequestParam String titel, @RequestParam String beschreibung, @RequestParam List<String> kategorien, @RequestParam boolean verfuegbarkeit, @RequestParam String verlag) {}

    @PostMapping("/{isbn}/borrow")
    public ResponseEntity<String> leiheBuchAus(@PathVariable String isbn, @RequestParam String nutzerId) {
        boolean success = buchService.leiheBuchAus(isbn, nutzerId);
        return success ? ResponseEntity.ok("Buch ausgeliehen")
                : ResponseEntity.badRequest().body("Nicht verfügbar");
    }

    @PostMapping("/{isbn}/reserve")
    public ResponseEntity<String> reserviereBuch(@PathVariable String isbn, @RequestParam String nutzerId) {
        boolean success = buchService.reserviereBuch(isbn, nutzerId);
        return success ? ResponseEntity.ok("Buch reserviert")
                : ResponseEntity.badRequest().body("Reservierung fehlgeschlagen");
    }

    @PostMapping("/{isbn}/watchlist")
    public ResponseEntity<String> fuegeZurWatchlistHinzu(@PathVariable String isbn, @RequestParam String nutzerId) {
        buchService.fuegeZurWatchlistHinzu(isbn, nutzerId);
        return ResponseEntity.ok("Zur Watchlist hinzugefügt");
    }


    //UPDATE
    @PutMapping("/edit")
    public ResponseEntity<BuchDTO> aktualisiereBuch(@RequestParam String isbn, @RequestParam String titel, @RequestParam String beschreibung, @RequestParam List<String> kategorien, @RequestParam boolean verfuegbarkeit, @RequestParam String verlag) {}

    //DELETE
    @DeleteMapping("/delete")
    public ResponseEntity<BuchDTO> loescheBuch(@RequestParam String isbn, @RequestParam String titel, @RequestParam String beschreibung, @RequestParam List<String> kategorien, @RequestParam boolean verfuegbarkeit, @RequestParam String verlag) {}
}
