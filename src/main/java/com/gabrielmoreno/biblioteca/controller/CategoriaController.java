package com.gabrielmoreno.biblioteca.controller;
import com.gabrielmoreno.biblioteca.model.Categoria;
import com.gabrielmoreno.biblioteca.repository.CategoriaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/categorias")
public class CategoriaController {
    private final CategoriaRepository repo;
    public CategoriaController(CategoriaRepository repo) { this.repo = repo; }
    @GetMapping public String listar(Model m) { m.addAttribute("itens", repo.findAll()); return "categorias/lista"; }
    @GetMapping("/novo") public String novo(Model m) { m.addAttribute("item", new Categoria()); return "categorias/formulario"; }
    @GetMapping("/editar/{id}") public String editar(@PathVariable Long id, Model m) { m.addAttribute("item", repo.findById(id).orElseThrow()); return "categorias/formulario"; }
    @PostMapping("/salvar") public String salvar(@ModelAttribute("item") Categoria item) { repo.save(item); return "redirect:/categorias"; }
    @PostMapping("/excluir/{id}") public String excluir(@PathVariable Long id) { repo.deleteById(id); return "redirect:/categorias"; }
}
