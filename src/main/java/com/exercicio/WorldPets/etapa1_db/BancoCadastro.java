package com.exercicio.WorldPets.etapa1_db;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.exercicio.WorldPets.Model.Cadastro;

public class BancoCadastro {
    private static ArrayList<Cadastro> cadastros;
	
    public static void init(){
        cadastros = new ArrayList<Cadastro>();
        cadastros.add(new Cadastro("Jose", "Rua 1", "jose@gmail.com", "4002-8922"));
    }

	public BancoCadastro() {
        cadastros = new ArrayList<>();
    }

    public static void addDado(Cadastro cadastro) {
		cadastros.add(cadastro);
	}

    public static ArrayList<Cadastro> recuperaDado() {
        return cadastros;
    }
    
    public static void deletar(Cadastro cadastro) {
        Predicate<Cadastro> condicao = cadastroListaDeletar -> cadastroListaDeletar.getId() == cadastro.getId();
		cadastros.removeIf(condicao);
	}

    public static List<Cadastro> all(){
        return cadastros;
    }
}
