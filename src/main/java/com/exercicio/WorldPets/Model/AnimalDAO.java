package com.exercicio.WorldPets.Model;

import java.util.ArrayList;

import com.exercicio.WorldPets.Repository.AnimalRepository;

public class AnimalDAO {
    private static AnimalRepository dbAnimal;
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
    
    private AnimalRepository getConnection(){
        if(this.dbAnimal == null){            
            AnimalRepository dbAnimal = new AnimalRepository();
            this.dbAnimal = dbAnimal;
        }
        return this.dbAnimal;    
    }
    
    public void create(Animal animal){
        AnimalRepository dbAnimal = getConnection();
        dbAnimal.add(animal);
    } 
    
    public ArrayList<Animal> read(){
        AnimalRepository dbAnimal = getConnection();
        return dbAnimal.all();
    }
    
    public void delete(Animal deletar){
        AnimalRepository dbAnimal = getConnection();
        dbAnimal.deletar(deletar);
    }

    public ArrayList<Animal> findAll(){
        return (ArrayList<Animal>) AnimalRepository.all();
    }
}
