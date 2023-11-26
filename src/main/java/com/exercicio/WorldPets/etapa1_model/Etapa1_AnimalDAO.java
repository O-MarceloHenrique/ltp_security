/* 
package com.exercicio.WorldPets.model;

import java.util.ArrayList;

import com.exercicio.WorldPets.etapa1_db.BancoAnimal;

public class AnimalDAO {
    private static BancoAnimal dbAnimal;
    private static AnimalDAO instance;
    public static ArrayList<Animal> animals = dbAnimal.all();

    private AnimalDAO(){
    }

    public static AnimalDAO getInstance() {
		if(instance == null){
            instance = new AnimalDAO();
        }
        return instance;
	}
    
    private BancoAnimal getConnection(){
        if(this.dbAnimal == null){            
            BancoAnimal dbAnimal = new BancoAnimal();
            this.dbAnimal = dbAnimal;
        }
        return this.dbAnimal;    
    }
    
    public void create(Animal animal){
        BancoAnimal dbAnimal = getConnection();
        dbAnimal.add(animal);
    } 
    
    public ArrayList<Animal> read(){
        BancoAnimal dbAnimal = getConnection();
        return dbAnimal.all();
    }
    
    public void delete(Animal deletar){
        BancoAnimal dbAnimal = getConnection();
        dbAnimal.deletar(deletar);
    }

    public ArrayList<Animal> findAll(){
        return (ArrayList<Animal>) BancoAnimal.all();
    }
}
*/
