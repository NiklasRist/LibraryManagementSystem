package at.fhv.librarymanagementsystem.controller;

import at.fhv.librarymanagementsystem.service.AusleiheService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class AusleiheController {

    private final AusleiheService ausleiheService;

    public AusleiheController(AusleiheService ausleiheService) {
        this.ausleiheService = ausleiheService;
    }

    //GET

    //POST

    //UPDATE

    //DELETE
}
