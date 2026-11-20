package com.gabrielmoreno.biblioteca.model;

public class Usuario {

    private String nome;
    private Boolean emprestimo; //se já está com um livro emprestado ou não

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Usuario(String nome, Boolean emprestimo) {
        this.nome = nome;
        this.emprestimo = false;
    }
}
