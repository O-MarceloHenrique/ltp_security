package com.exercicio.WorldPets.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.exercicio.WorldPets.Model.Cadastro;
import com.exercicio.WorldPets.Repository.CadastroRepository;

@RestController
@CrossOrigin
public class CadastroController {
    @Autowired
    CadastroRepository cadastrosRepository;

    @PostMapping("/cadastro")
    public Cadastro cadastrarUsuario(@RequestBody Cadastro cadastro) {
        return cadastrosRepository.save(cadastro);
    }

    @GetMapping("/cadastro")
    public List<Cadastro> recuperarUsuario() {
        return (List<Cadastro>) cadastrosRepository.findAll();
    }

    @DeleteMapping("/cadastro/{id}")
    public String deletarUsuario(@PathVariable("id") Long id){
        if(cadastrosRepository.existsById(id)){
            cadastrosRepository.deleteById(id);
            return "Cadastro foi excluido com sucesso!";
        }else{
            return "ID do cadastro não encontrado!";
        }
    }
}
