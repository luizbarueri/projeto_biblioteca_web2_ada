package com.web2.biblioteca.Controller;

import com.web2.biblioteca.Model.LivrosEntity;
import com.web2.biblioteca.Repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivrosController {
    @Autowired
    private LivrosRepository repository;

    @GetMapping
    public List<LivrosEntity> findAll() {
        return repository.findAll();
    }

    @PostMapping
    @RequestMapping("/salvar")
    public String salvarLivro(@RequestBody LivrosEntity livro){
        repository.save(livro);
        return HttpStatus.OK.toString();
    }
}
