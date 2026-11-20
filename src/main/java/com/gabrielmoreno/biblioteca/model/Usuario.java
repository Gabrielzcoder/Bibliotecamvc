package com.gabrielmoreno.biblioteca.model;
import jakarta.persistence.*;
@Entity
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String nome;
    private Boolean emprestimo = false;
    public Usuario() {}
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Boolean getEmprestimo() { return emprestimo; }
    public void setEmprestimo(Boolean emprestimo) { this.emprestimo = emprestimo; }
}
