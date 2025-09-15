package at.fhv.librarymanagementsystem.controller;

import at.fhv.librarymanagementsystem.service.AutorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    //GET

    //POST

    //UPDATE

    //DELETE

}
