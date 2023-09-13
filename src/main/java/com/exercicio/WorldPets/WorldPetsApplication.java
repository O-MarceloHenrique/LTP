package com.exercicio.WorldPets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exercicio.WorldPets.Repository.ResgateRepository;

@SpringBootApplication
public class WorldPetsApplication {

	public static void main(String[] args) {
		ResgateRepository.init();
		SpringApplication.run(WorldPetsApplication.class, args);
	}
}
