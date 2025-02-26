package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class App {

    @GetMapping("/{senha}")
    public String liberarAcesso(@PathVariable String senha) {
        if (senha.equals("senha123")) {
            return "Entrada autorizada";
        } else {
            return "Entrada não autorizada";
        }
    }

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }
}
