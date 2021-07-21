package dev.chamalwr.peopleservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping()
    public String welcome(){
        return "Welcome to Ansible Demo! Spring Boot";
    }
}
