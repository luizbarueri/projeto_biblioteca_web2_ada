package com.web2.biblioteca.Controller;

import com.web2.biblioteca.Model.EmprestimosEntity;
import com.web2.biblioteca.Model.LivrosEntity;
import com.web2.biblioteca.Repository.EmprestimosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmprestimosController {
    @Autowired
    private EmprestimosRepository repository;

    @GetMapping("/emprestimos")
    public List<EmprestimosEntity> findAll() {
        return repository.findAll();
    }
}
