package at.fhv.librarymanagementsystem.controller;

import at.fhv.librarymanagementsystem.service.ReservierungService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class ReservierungController {

    private final ReservierungService reservierungService;

    public ReservierungController(ReservierungService reservierungService) {
        this.reservierungService = reservierungService;
    }

    //GET

    //POST

    //UPDATE

    //DELETE
}
