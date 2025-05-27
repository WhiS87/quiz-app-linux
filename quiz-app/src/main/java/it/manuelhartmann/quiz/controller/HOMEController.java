package it.manuelhartmann.quiz.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HOMEController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
