package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FeaturesController {
    @GetMapping("/features")
    public String greeting(Model model) {
        return "features";
    }
}
