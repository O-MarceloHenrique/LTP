package com.exercicio.WorldPets.Model;

import java.util.ArrayList;

import com.exercicio.WorldPets.Repository.ResgateRepository;

public class ResgateDAO {
    private ResgateRepository dbResgate;
    private static ResgateDAO instance;

    private ResgateDAO(){
    }
    
    private ResgateRepository getConnection(){
        if(this.dbResgate == null){            
            ResgateRepository dbResgate = new ResgateRepository();
            this.dbResgate = dbResgate;
        }
        return this.dbResgate;    
    }
    
    public void criar(Resgate novo){
        ResgateRepository dbResgate = getConnection();
        dbResgate.addDadoResgate(novo);
    } 
    
    public ArrayList<Resgate> read(){
        ResgateRepository dbResgate = getConnection();
        return dbResgate.recuperaDadoResgate();
    }

    public static ResgateDAO getInstance() {
		if(instance == null){
            instance = new ResgateDAO();
        }
        return instance;
	}
    
    public void deletar(Resgate deletar){
        ResgateRepository dbResgate = getConnection();
        dbResgate.deletar(deletar);
    }

    public ArrayList<Resgate> mostrar(){
        return (ArrayList<Resgate>) ResgateRepository.mostrar();
    }
}
