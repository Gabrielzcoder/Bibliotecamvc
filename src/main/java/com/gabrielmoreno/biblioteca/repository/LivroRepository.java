package com.gabrielmoreno.biblioteca.repository;

import com.gabrielmoreno.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
