package com.exercicio.WorldPets.repository;

import org.springframework.data.repository.CrudRepository;

import com.exercicio.WorldPets.model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
    
}
