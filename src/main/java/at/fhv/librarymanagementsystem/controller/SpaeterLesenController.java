package at.fhv.librarymanagementsystem.controller;

import at.fhv.librarymanagementsystem.service.SpaeterLesenService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class SpaeterLesenController {

    private final SpaeterLesenService spaeterLesenService;

    public SpaeterLesenController(SpaeterLesenService spaeterLesenService) {
        this.spaeterLesenService = spaeterLesenService;
    }

    //GET

    //POST

    //UPDATE

    //DELETE
}
