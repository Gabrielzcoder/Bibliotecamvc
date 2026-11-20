package com.gabrielmoreno.biblioteca.model;
import jakarta.persistence.*;
@Entity
public class Categoria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private int idadeMinima;
    private String genero;
    public Categoria() {}
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public int getIdadeMinima() { return idadeMinima; }
    public void setIdadeMinima(int idadeMinima) { this.idadeMinima = idadeMinima; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}
