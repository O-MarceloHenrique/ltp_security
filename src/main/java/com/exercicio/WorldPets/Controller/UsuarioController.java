package com.exercicio.WorldPets.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.WorldPets.Model.Usuario;
import com.exercicio.WorldPets.Repository.UsuarioRepository;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/criar")
    public String criarUsuario(@RequestBody Usuario novo){
        novo.setPassword(
            passwordEncoder.encode(novo.getPassword())
        );
        Usuario usuarioCriado = usuarioRepository.save(novo);

        if(usuarioCriado != null)
            return "Usuário criado com sucesso!";        
        
        return "Erro ao criar usuário";
    }
}
