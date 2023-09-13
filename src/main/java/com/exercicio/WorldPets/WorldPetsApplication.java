package com.exercicio.WorldPets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

<<<<<<< HEAD
import com.exercicio.WorldPets.Repository.ResgateRepository;
=======
import com.exercicio.WorldPets.Repository.CadastroRepository;
>>>>>>> origin/Isabele

@SpringBootApplication
public class WorldPetsApplication {

	public static void main(String[] args) {
<<<<<<< HEAD
		ResgateRepository.init();
=======
		CadastroRepository.init();
>>>>>>> origin/Isabele
		SpringApplication.run(WorldPetsApplication.class, args);
	}
}
