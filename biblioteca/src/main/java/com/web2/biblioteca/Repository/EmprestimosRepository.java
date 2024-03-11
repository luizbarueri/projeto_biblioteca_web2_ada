package com.web2.biblioteca.Repository;

import com.web2.biblioteca.Model.EmprestimosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimosRepository extends JpaRepository<EmprestimosEntity, Integer> {
}
