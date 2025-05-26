package it.manuelhartmann.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class HOMEController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
