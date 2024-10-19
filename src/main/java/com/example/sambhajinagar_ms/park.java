package com.example.sambhajinagar_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class park {
    @GetMapping("/park")
    public String getData() {return  "Welcome to park learn aws sagemaker kubeflow mlflow tensorflow Class" ; }
}
