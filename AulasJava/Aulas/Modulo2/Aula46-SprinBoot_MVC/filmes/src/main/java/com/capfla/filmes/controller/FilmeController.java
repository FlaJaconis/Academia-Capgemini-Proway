package com.capfla.filmes.controller;

import java.util.List;


import com.capfla.filmes.model.Filme;
import com.capfla.filmes.repository.FilmeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller //anotação para a API entender que é uma classe controladora de requisição
public class FilmeController {

    private FilmeRepository repository;

    public FilmeController(FilmeRepository repository){
        this.repository = repository;
    }

  //método que controla as rotas
    @GetMapping("/filme")
    public String filmes(Model req){

        List<Filme>lista = (List<Filme>)repository.findAll();
        req.addAttribute("filmes", lista);

        //rota do template "filmes.html"
        return "filmes"; //não é preciso extensão, pois a dependência de Thymeleaf faz o gerenciamento dessas rotas 
    }
    
    //read
    @GetMapping("/filme/form")
    public String formulario(Model req){
        Filme model = new Filme();        
        req.addAttribute("filme", model);
        return "filmes-form";
    }

    //create
    @PostMapping("/filme/salvar")    
    public String salvar(Filme model){
        repository.save(model);
        return "redirect:/filme";
    }

    //delete
    @GetMapping("/filme/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/filme";
    }

    //update
    @GetMapping("/filme/editar/{id}")
    public String editar(@PathVariable int id, Model req){
        Filme model = repository.findById(id).get();
        req.addAttribute("filme", model);
        return "filmes-form";
    }
}
