package com.gabrielmoreno.biblioteca.repository;
import com.gabrielmoreno.biblioteca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
