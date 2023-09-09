package com.exercicio.WorldPets.Model;

import java.util.ArrayList;

import com.exercicio.WorldPets.Repository.CadastroRepository;

public class CadastroDAO {
    private CadastroRepository db;
    private static CadastroDAO instance;
    
    private CadastroDAO(){
    }
    
    public static CadastroDAO getInstance() {
		if(instance == null){
            instance = new CadastroDAO();
        }
        return instance;
	}

    private CadastroRepository getConnection(){
        if(this.db == null){            
            CadastroRepository db = new CadastroRepository();
            this.db = db;
        }
        return this.db;    
    }
    
    public void create(Cadastro novo){
        CadastroRepository db = getConnection();
        db.addDado(novo);
    } 
    
    public ArrayList<Cadastro> read(){
        CadastroRepository db = getConnection();
        return db.recuperaDado();
    }
    
    public void delete(Cadastro deletar){
        CadastroRepository db = getConnection();
        db.deletar(deletar);
    }

    public ArrayList<Cadastro> findAll(){
        //return (List<Relato>) Relato.all();
        return (ArrayList<Cadastro>) CadastroRepository.all();
    }
}
