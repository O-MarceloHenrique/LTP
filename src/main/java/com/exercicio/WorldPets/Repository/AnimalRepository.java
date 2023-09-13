package com.exercicio.WorldPets.Repository;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.exercicio.WorldPets.Model.Animal;

public class AnimalRepository {
    private static ArrayList<Animal> animals;
	
    public static void init(){
        animals = new ArrayList<Animal>();
        animals.add(new Animal("ViraLata", "1", "pequeno", "macho", "cachorro"));
    }

	public AnimalRepository() {
        animals = new ArrayList<>();
    }

    public static void add(Animal animal) {
		animals.add(animal);
	}

    public static void deletar(Animal animal) {
        Predicate<Animal> criterio = animallista -> animallista.getId() == animal.getId();
		animals.removeIf(criterio);
	}

    public static ArrayList<Animal> all() {
        return animals;
    }
}
