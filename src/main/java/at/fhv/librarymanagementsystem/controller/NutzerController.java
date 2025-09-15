package at.fhv.librarymanagementsystem.controller;

import at.fhv.librarymanagementsystem.service.NutzerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class NutzerController {
    private final NutzerService nutzerService;

    public NutzerController(NutzerService nutzerService) {
        this.nutzerService = nutzerService;
    }

    //GET

    //POST

    //UPDATE

    //DELETE
}
