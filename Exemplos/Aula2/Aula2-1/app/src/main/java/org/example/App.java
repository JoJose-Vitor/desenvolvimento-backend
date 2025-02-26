package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class App {

    @GetMapping("/ola/{nome}")
    public static String olaMundo(@PathVariable("nome") String nome){
        return "Ola, " + nome;
    }

    @PostMapping("/valida-idade")
    public String validaIdadeUsuarop(@RequestBody Usuario usuario){
        if(usuario.getIdade() >= 18){
            return "O usuario " + usuario.getNome() + " pode acessar o sistema";
        }
        return "O usuario " + usuario.getNome() + " não pode acessar o sistema";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
