
package org.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/app")
public class App {

    private static List<IlhaDeCalor> ilhasDeCalor = new ArrayList<>();

    @GetMapping("/ilhas-de-calor")
    public static List<IlhaDeCalor> listarIlhasDeCalor() {
        return ilhasDeCalor;
    }

    @PostMapping("/ilhas-de-calor")
    public static String adicionarIlhaDeCalor(@RequestBody IlhaDeCalor novaIlha) {
        ilhasDeCalor.add(novaIlha);
        return "Ilha de calor " + novaIlha.getBairro() + " adicionada com sucesso!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
