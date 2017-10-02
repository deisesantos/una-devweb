package br.com.dweb.auladweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.dweb.auladweb.entity.Cliente;
import br.com.dweb.auladweb.repository.ClienteRepository;

@Controller
public class ClienteController {
	
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("cliente", new Cliente());
        model.addAttribute("clientes", clienteRepository.findAll());
        return "cliente/listar";
    }

    @GetMapping("/{id}")
    public String editar(Model model, @PathVariable Integer id) {
        model.addAttribute("cliente", clienteRepository.findOne(id));
        model.addAttribute("clientes", clienteRepository.findAll());
        return "cliente/listar";
    }

    @GetMapping("/buscar")
    public String buscar(Model model, @RequestParam String nome) {
        model.addAttribute("cliente", new Cliente());
        model.addAttribute("clientes", clienteRepository.findByNomeLike("%" + nome + '%'));
        return "cliente/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
    	clienteRepository.delete(id);
        return "redirect:/";
    }

    @PostMapping("/")
    public String salvar(@Valid @ModelAttribute Cliente cliente,
                         BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "cliente/listar";
        }
        clienteRepository.save(cliente);
        return "redirect:/";
    }

}
