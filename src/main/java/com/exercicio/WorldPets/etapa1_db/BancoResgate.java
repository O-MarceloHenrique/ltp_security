package com.exercicio.WorldPets.etapa1_db;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.exercicio.WorldPets.Model.Resgate;

public class BancoResgate {
    private static ArrayList<Resgate> resgates;
	
    public static void init(){
        resgates = new ArrayList<Resgate>();
        resgates.add(new Resgate("19/02/2023", "Bragança Paulista", "Animal atropelado", "Gato"));
    }

	public BancoResgate() {
        resgates = new ArrayList<>();
    }

    public static void addDadoResgate(Resgate resgate) {
		resgates.add(resgate);
	}

    public static ArrayList<Resgate> recuperaDadoResgate() {
        return resgates;
    }

    public static List<Resgate> mostrar(){
        return resgates;
    }
    
    public static void deletar(Resgate resgate) {
        Predicate<Resgate> resgatar = resgateDel -> resgateDel.getId() == resgate.getId();
		resgates.removeIf(resgatar);
	}
}
