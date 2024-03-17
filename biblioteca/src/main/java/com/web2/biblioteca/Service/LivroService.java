package com.web2.biblioteca.Service;

import com.web2.biblioteca.Model.LivrosEntity;
import com.web2.biblioteca.Repository.LivrosRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    private LivrosRepository repository;
    public LivroService(LivrosRepository repository){
        this.repository = repository;
    }

    public LivrosRepository getRepository() {
        return repository;
    }

    public void setRepository(LivrosRepository repository) {
        this.repository = repository;
    }
    public void salvarLivro(LivrosEntity livro) {
        this.repository.save(livro);
    }

    public void deletaLivroId(Integer id) {
        this.repository.deleteById(id);
    }

}
