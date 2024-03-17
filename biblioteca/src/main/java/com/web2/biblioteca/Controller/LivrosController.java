package com.web2.biblioteca.Controller;

import com.web2.biblioteca.Model.LivrosEntity;
import com.web2.biblioteca.Repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping
    @RequestMapping("/{id}")
    public LivrosEntity getOneUser(@PathVariable Integer id){
        LivrosEntity entidade = repository.findById(id).get();

        return entidade;
    }

    @PutMapping
    @RequestMapping("/alterar/{id}")
    public LivrosEntity getOneUser(@PathVariable Integer id, @RequestBody LivrosEntity livro){
        LivrosEntity entidade = repository.findById(id).get();
        
        repository.save(livro);

        //entidade = livro;

        return entidade;
    }


}
