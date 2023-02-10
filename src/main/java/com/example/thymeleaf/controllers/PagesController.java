package com.example.thymeleaf.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
@RequestMapping("/th")
public class PagesController {

    @GetMapping("welcome")
    public String welcome(Model model) {
        model.addAttribute("data", LocalDate.now());
        return "welcome";
    }

    @GetMapping("info")
    public String info(Model model) {
        model.addAttribute("data", LocalDate.now());
        model.addAttribute("time", System. currentTimeMillis() + " millisec");
        return "info";
    }

}
