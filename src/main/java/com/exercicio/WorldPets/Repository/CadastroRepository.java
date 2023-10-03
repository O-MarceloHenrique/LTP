package com.exercicio.WorldPets.repository;

import org.springframework.data.repository.CrudRepository;

import com.exercicio.WorldPets.model.Cadastro;

public interface CadastroRepository extends CrudRepository<Cadastro, Long> {
    
}
