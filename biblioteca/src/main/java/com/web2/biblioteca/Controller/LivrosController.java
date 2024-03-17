package com.web2.biblioteca.Controller;

import com.web2.biblioteca.Model.LivrosEntity;
import com.web2.biblioteca.Repository.LivrosRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
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

    @PutMapping("/alterar/{id}")
    @Transactional
    public LivrosEntity updateLivro(@RequestBody LivrosEntity livro, @PathVariable Integer id) {
        Optional<LivrosEntity> optionalLivro = repository.findById(id);
        if (optionalLivro.isPresent()) {
            LivrosEntity dadoslivro = optionalLivro.get();
            dadoslivro.setTitulo(livro.getTitulo());
            dadoslivro.setAutor(livro.getAutor());
            dadoslivro.setAno_publicacao(livro.getAno_publicacao());
            return dadoslivro;
        } else {
            throw new EntityNotFoundException();
        }
    }

//    @DeleteMapping("/{id}")
//    @Transactional
//    public ResponseEntity deleteProduct(@PathVariable String id){
//        Optional<Product> optionalProduct = repository.findById(id);
//        if (optionalProduct.isPresent()) {
//            Product product = optionalProduct.get();
//            product.setActive(false);
//            return ResponseEntity.noContent().build();
//        } else {
//            throw new EntityNotFoundException();
//        }
//    }


}
