package at.fhv.librarymanagementsystem.controller;

import at.fhv.librarymanagementsystem.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    //GET

    //POST

    //UPDATE

    //DELETE

}
