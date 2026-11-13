package com.gabrielmoreno.biblioteca.model;

public class Autor {

    private String nome;
    private String nacionalidade;
    private Livro livro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Autor(String nome, String nacionalidade, Livro livro) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.livro = livro;
    }
}
