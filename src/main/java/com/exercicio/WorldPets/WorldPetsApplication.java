package com.exercicio.WorldPets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exercicio.WorldPets.Repository.CadastroRepository;

@SpringBootApplication
public class WorldPetsApplication {

	public static void main(String[] args) {
		CadastroRepository.init();
		SpringApplication.run(WorldPetsApplication.class, args);
	}
}
