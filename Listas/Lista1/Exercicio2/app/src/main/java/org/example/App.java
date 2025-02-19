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

    @GetMapping("/{quilometragem}")
    public String PrecoSafari(@PathVariable String quilometragem){
        double valor = ((Double.parseDouble(quilometragem)) * 25);
        return "O preco final de sua expedicao eh: " + valor + " pratas";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
