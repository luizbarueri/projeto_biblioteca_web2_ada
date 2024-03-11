package com.web2.biblioteca.Controller;

import com.web2.biblioteca.Model.MembrosEntity;
import com.web2.biblioteca.Repository.MembrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/membros")
public class MembrosController {
    @Autowired
    private MembrosRepository repository;
    @GetMapping
    public List<MembrosEntity> findAll() {
        return repository.findAll();
    }
}
