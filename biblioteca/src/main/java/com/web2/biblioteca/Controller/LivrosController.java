package com.web2.biblioteca.Controller;

import com.web2.biblioteca.Model.LivrosEntity;
import com.web2.biblioteca.Repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
