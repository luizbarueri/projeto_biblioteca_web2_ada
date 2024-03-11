package com.web2.biblioteca.Repository;

import com.web2.biblioteca.Model.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembrosRepository extends JpaRepository<MembrosEntity, Integer> {
}
