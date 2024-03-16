package com.web2.biblioteca.Service;

import com.web2.biblioteca.Model.LivrosEntity;
import com.web2.biblioteca.Repository.LivrosRepository;
import org.springframework.stereotype.Service;

@Service
public class LivrosService {
    private LivrosRepository repository;

    public LivrosService(LivrosRepository repository) {
        this.repository = repository;
    }
    public void salvarLivro(LivrosEntity livro) {
        repository.save(livro);
    }
}
