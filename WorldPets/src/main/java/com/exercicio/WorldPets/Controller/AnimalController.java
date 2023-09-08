package com.exercicio.WorldPets.Controller;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.WorldPets.Model.Animal;
import com.exercicio.WorldPets.Model.AnimalDAO;
import com.exercicio.WorldPets.Repository.AnimalRepository;

@RestController
public class AnimalController {
    
    @PostMapping("/cadastro/animal")
    public void addAnimal(@RequestBody Animal animal) {
        AnimalDAO anim = AnimalDAO.getInstance();
        anim.create(animal);
    }

    @GetMapping("/recuperar/animal")
    public List<Animal> listarAnimals() {
        return AnimalRepository.all();
    }

    @DeleteMapping("/deletar/animal")
    public ResponseEntity<String> deleteAnimal(@RequestBody Animal animal){
        AnimalRepository.deletar(animal);
        return ResponseEntity.ok("O animal foi excluido com sucesso");
    }
}
