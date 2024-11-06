package com.example.sambhajinagar_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ccna {
    @GetMapping("/ccna")
    public String getData() {return  "Welcome to ccna learn aws stagemaker kubeflow mlflow tensorfloe Class" ; }
}