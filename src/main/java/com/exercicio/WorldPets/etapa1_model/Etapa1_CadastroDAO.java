/*
package com.exercicio.WorldPets.model;

import java.util.ArrayList;

import com.exercicio.WorldPets.etapa1_db.BancoCadastro;


public class CadastroDAO {
    private BancoCadastro db;
    private static CadastroDAO instance;
    
    private CadastroDAO(){
    }
    
    public static CadastroDAO getInstance() {
		if(instance == null){
            instance = new CadastroDAO();
        }
        return instance;
	}

    private BancoCadastro getConnection(){
        if(this.db == null){            
            BancoCadastro db = new BancoCadastro();
            this.db = db;
        }
        return this.db;    
    }
    
    public void create(Cadastro novo){
        BancoCadastro db = getConnection();
        db.addDado(novo);
    } 
    
    public ArrayList<Cadastro> read(){
        BancoCadastro db = getConnection();
        return db.recuperaDado();
    }
    
    public void delete(Cadastro deletar){
        BancoCadastro db = getConnection();
        db.deletar(deletar);
    }

    public ArrayList<Cadastro> findAll(){
        //return (List<Relato>) Relato.all();
        return (ArrayList<Cadastro>) BancoCadastro.all();
    }
}
*/
