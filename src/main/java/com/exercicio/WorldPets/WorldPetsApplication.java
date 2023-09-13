package com.exercicio.WorldPets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exercicio.WorldPets.Repository.AnimalRepository;

@SpringBootApplication
public class WorldPetsApplication {

	public static void main(String[] args) {
		AnimalRepository.init();
		SpringApplication.run(WorldPetsApplication.class, args);
	}
}
