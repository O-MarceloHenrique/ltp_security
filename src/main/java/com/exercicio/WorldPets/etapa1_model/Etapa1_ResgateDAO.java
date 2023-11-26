/*
package com.exercicio.WorldPets.model;

import java.util.ArrayList;

import com.exercicio.WorldPets.etapa1_db.BancoResgate;

public class ResgateDAO {
    private BancoResgate dbResgate;
    private static ResgateDAO instance;

    private ResgateDAO(){
    }
    
    private BancoResgate getConnection(){
        if(this.dbResgate == null){            
            BancoResgate dbResgate = new BancoResgate();
            this.dbResgate = dbResgate;
        }
        return this.dbResgate;    
    }
    
    public void criar(Resgate novo){
        BancoResgate dbResgate = getConnection();
        dbResgate.addDadoResgate(novo);
    } 
    
    public ArrayList<Resgate> read(){
        BancoResgate dbResgate = getConnection();
        return dbResgate.recuperaDadoResgate();
    }

    public static ResgateDAO getInstance() {
		if(instance == null){
            instance = new ResgateDAO();
        }
        return instance;
	}
    
    public void deletar(Resgate deletar){
        BancoResgate dbResgate = getConnection();
        dbResgate.deletar(deletar);
    }

    public ArrayList<Resgate> mostrar(){
        return (ArrayList<Resgate>) BancoResgate.mostrar();
    }
}
*/
