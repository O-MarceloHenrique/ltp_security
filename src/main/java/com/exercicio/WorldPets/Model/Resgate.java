package com.exercicio.WorldPets.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resgate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dataResgate;
    private String localResgate;
    private String descricaoResgate;
    private String animalResgatado;
    
    public Resgate(){
    }

    public Resgate(String dataResgate, String localResgate, String descricaoResgate, String animalResgatado) {
        this.dataResgate = dataResgate;
        this.localResgate = localResgate;
        this.descricaoResgate = descricaoResgate;
        this.animalResgatado = animalResgatado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataResgate() {
        return dataResgate;
    }

    public void setDataResgate(String dataResgate) {
        this.dataResgate = dataResgate;
    }

    public String getLocalResgate() {
        return localResgate;
    }

    public void setLocalResgate(String localResgate) {
        this.localResgate = localResgate;
    }

    public String getDescricaoResgate() {
        return descricaoResgate;
    }

    public void setDescricaoResgate(String descricaoResgate) {
        this.descricaoResgate = descricaoResgate;
    }

    public String getAnimalResgatado() {
        return animalResgatado;
    }

    public void setAnimalResgatado(String animalResgatado) {
        this.animalResgatado = animalResgatado;
    }
}