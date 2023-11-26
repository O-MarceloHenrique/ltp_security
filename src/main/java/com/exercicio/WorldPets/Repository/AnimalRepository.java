package com.exercicio.WorldPets.Repository;

import org.springframework.data.repository.CrudRepository;

import com.exercicio.WorldPets.Model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
    
}
