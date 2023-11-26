package com.exercicio.WorldPets.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.exercicio.WorldPets.Model.Usuario;
import com.exercicio.WorldPets.Repository.UsuarioRepository;

public class MeuUsuarioDetailsService implements UserDetailsService{
    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario userLogin = usuarioRepository.findByUsername(username);
        if(userLogin == null)
            throw new UsernameNotFoundException(username);
        return new MeuUsuarioDetails(userLogin);
    }
}
