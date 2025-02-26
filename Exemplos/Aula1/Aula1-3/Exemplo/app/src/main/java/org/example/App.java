package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class App {

    @GetMapping("/ola")
    public String ola(){
        return "Olá!";
    }

    @GetMapping("/mundo")
    public String mundo(){
        return "Mundo!";
    }

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

        
    }
}
