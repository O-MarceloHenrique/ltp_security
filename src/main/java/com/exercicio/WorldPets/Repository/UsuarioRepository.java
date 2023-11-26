package com.exercicio.WorldPets.Repository;

import org.springframework.data.repository.CrudRepository;

import com.exercicio.WorldPets.Model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
