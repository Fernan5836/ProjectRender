package com.rest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String welcome() {
        return "Bienvenido soy Fernando Javier Pérez Vásquez";
    }
}
