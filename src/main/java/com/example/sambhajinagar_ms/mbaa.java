package com.example.sambhajinagar_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class mbaa {
    @GetMapping("/mbaa")
    public String getData() {return  "Welcome to mbaa class" ; }
}

