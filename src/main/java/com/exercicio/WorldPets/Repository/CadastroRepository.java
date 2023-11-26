package com.exercicio.WorldPets.Repository;

import org.springframework.data.repository.CrudRepository;

import com.exercicio.WorldPets.Model.Cadastro;

public interface CadastroRepository extends CrudRepository<Cadastro, Long> {
    
}
