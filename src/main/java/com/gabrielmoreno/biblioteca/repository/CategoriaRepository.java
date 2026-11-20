package com.gabrielmoreno.biblioteca.repository;
import com.gabrielmoreno.biblioteca.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
