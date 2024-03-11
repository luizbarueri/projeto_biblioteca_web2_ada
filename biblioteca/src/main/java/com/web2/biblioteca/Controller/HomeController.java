package com.web2.biblioteca.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home() {
        String msg = "<h1>Biblioteca de Livros - iTech50+</h1>";
        String menu = "<ul><li><a href = 'http://localhost:8080/emprestimos'>Listar Emprestimos</a></li>" +
                "<a href = 'http://localhost:8080/livros'>Listar Livros</a></li>" +
                "<li><a href = 'http://localhost:8080/membros'>Listar Membros</a></li></ul>";

        String imagemUrl = "<img src = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXHF4ywVEACFTYvXQdwnc694yggl6qAtTZrQ&usqp=CAU' alt='imagem biblioteca'</img>";

        String result = msg + "<br></br>" + menu + "<br></br>" + imagemUrl;

        return result;
    }
}
