package com.gabrielmoreno.biblioteca.controller;
import com.gabrielmoreno.biblioteca.model.Usuario;
import com.gabrielmoreno.biblioteca.repository.UsuarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioRepository repo;
    public UsuarioController(UsuarioRepository repo) { this.repo = repo; }
    @GetMapping public String listar(Model m) { m.addAttribute("itens", repo.findAll()); return "usuarios/lista"; }
    @GetMapping("/novo") public String novo(Model m) { m.addAttribute("item", new Usuario()); return "usuarios/formulario"; }
    @GetMapping("/editar/{id}") public String editar(@PathVariable Long id, Model m) { m.addAttribute("item", repo.findById(id).orElseThrow()); return "usuarios/formulario"; }
    @PostMapping("/salvar") public String salvar(@ModelAttribute("item") Usuario item) { repo.save(item); return "redirect:/usuarios"; }
    @PostMapping("/excluir/{id}") public String excluir(@PathVariable Long id) { repo.deleteById(id); return "redirect:/usuarios"; }
}
