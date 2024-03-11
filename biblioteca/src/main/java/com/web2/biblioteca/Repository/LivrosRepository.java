package com.web2.biblioteca.Repository;

import com.web2.biblioteca.Model.LivrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<LivrosEntity, Integer> {
}
