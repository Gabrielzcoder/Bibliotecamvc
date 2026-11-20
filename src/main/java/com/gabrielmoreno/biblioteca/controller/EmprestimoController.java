package com.gabrielmoreno.biblioteca.controller;
import com.gabrielmoreno.biblioteca.model.Emprestimo;
import com.gabrielmoreno.biblioteca.repository.EmprestimoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/emprestimos")
public class EmprestimoController {
    private final EmprestimoRepository repo;
    public EmprestimoController(EmprestimoRepository repo) { this.repo = repo; }
    @GetMapping public String listar(Model m) { m.addAttribute("itens", repo.findAll()); return "emprestimos/lista"; }
    @GetMapping("/novo") public String novo(Model m) { m.addAttribute("item", new Emprestimo()); return "emprestimos/formulario"; }
    @GetMapping("/editar/{id}") public String editar(@PathVariable Long id, Model m) { m.addAttribute("item", repo.findById(id).orElseThrow()); return "emprestimos/formulario"; }
    @PostMapping("/salvar") public String salvar(@ModelAttribute("item") Emprestimo item) { repo.save(item); return "redirect:/emprestimos"; }
    @PostMapping("/excluir/{id}") public String excluir(@PathVariable Long id) { repo.deleteById(id); return "redirect:/emprestimos"; }
}
