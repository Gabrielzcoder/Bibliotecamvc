package com.gabrielmoreno.biblioteca.repository;
import com.gabrielmoreno.biblioteca.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {}
