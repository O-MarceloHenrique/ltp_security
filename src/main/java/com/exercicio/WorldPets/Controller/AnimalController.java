package com.exercicio.WorldPets.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.WorldPets.Model.Animal;
import com.exercicio.WorldPets.Repository.AnimalRepository;

@RestController
@CrossOrigin
public class AnimalController {
    @Autowired
    AnimalRepository animalsRepository;

    @PostMapping("/animal")
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalsRepository.save(animal);
    }
    
    @GetMapping("/animal")
    public List<Animal> listarAnimals() {
        return (List<Animal>) animalsRepository.findAll();
    }

    @GetMapping("/animal/{id}")
    public Optional<Animal> listarAnimalId(@PathVariable("id") Long id) {
        if(animalsRepository.existsById(id)){
            return animalsRepository.findById(id);
        }else{
            return null;
        }
    }

    @DeleteMapping("/animal/{id}")
    public String deleteAnimal(@PathVariable("id") Long id){
        if(animalsRepository.existsById(id)){
            animalsRepository.deleteById(id);
            return "Animal foi excluido com sucesso!";
        }else{
            return "ID do animal não encontrado!";
        }
    }
}