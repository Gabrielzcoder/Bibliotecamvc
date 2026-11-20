package com.gabrielmoreno.biblioteca.model;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
public class Emprestimo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String livro;
    private String usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataVencimento;
    public Emprestimo() {}
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getLivro() { return livro; }
    public void setLivro(String livro) { this.livro = livro; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public LocalDate getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(LocalDate dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }
    public LocalDate getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(LocalDate dataVencimento) { this.dataVencimento = dataVencimento; }
}
