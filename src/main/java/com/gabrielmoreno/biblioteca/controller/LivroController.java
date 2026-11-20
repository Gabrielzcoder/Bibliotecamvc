package com.gabrielmoreno.biblioteca.controller;

import com.gabrielmoreno.biblioteca.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {
    List<Livro> livros = new ArrayList<>();

    @GetMapping("/livro")
    public String exibirLivro(Model model) {

        Livro livro = new Livro();
        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setIsbn("978-85-00-00000-0");

        model.addAttribute("livro", livro);
        livros.add(livro);

        return "livro";
    }

    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";
    }

    @DeleteMapping
    public String excluir(@PathVariable int indice) {
        if (indice >= 0 && indice < livros.size()) {
            livros.remove(indice);
        }
        return "redirect:/livros";
    }
}