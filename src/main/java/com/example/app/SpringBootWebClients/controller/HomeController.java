package com.example.app.SpringBootWebClients.controller;

import com.example.app.SpringBootWebClients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    ClientService service;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("clients", service.getClients());
        return "home";
    }
}