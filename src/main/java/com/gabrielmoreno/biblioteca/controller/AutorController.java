package com.gabrielmoreno.biblioteca.controller;
import com.gabrielmoreno.biblioteca.model.Autor;
import com.gabrielmoreno.biblioteca.repository.AutorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/autores")
public class AutorController {
    private final AutorRepository repo;
    public AutorController(AutorRepository repo) { this.repo = repo; }
    @GetMapping public String listar(Model m) { m.addAttribute("itens", repo.findAll()); return "autores/lista"; }
    @GetMapping("/novo") public String novo(Model m) { m.addAttribute("item", new Autor()); return "autores/formulario"; }
    @GetMapping("/editar/{id}") public String editar(@PathVariable Long id, Model m) { m.addAttribute("item", repo.findById(id).orElseThrow()); return "autores/formulario"; }
    @PostMapping("/salvar") public String salvar(@ModelAttribute("item") Autor item) { repo.save(item); return "redirect:/autores"; }
    @PostMapping("/excluir/{id}") public String excluir(@PathVariable Long id) { repo.deleteById(id); return "redirect:/autores"; }
}
