package com.exercicio.WorldPets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.WorldPets.model.Resgate;
import com.exercicio.WorldPets.repository.ResgateRepository;

@RestController
@CrossOrigin
public class ResgateController {
    @Autowired
    ResgateRepository resgatesRepository;

    @PostMapping("/resgate")
    public Resgate endPoint1(@RequestBody Resgate resgate) {
        return resgatesRepository.save(resgate);
    }

    @GetMapping("/resgate/{id}")
    public List<Resgate> endPoint2() {
        return (List<Resgate>) resgatesRepository.findAll();
    }

    @DeleteMapping("/resgate")
    public String endPoint3(@PathVariable("id") Long id){
        if(resgatesRepository.existsById(id)){
            resgatesRepository.deleteById(id);
            return "Cadastro foi excluido com sucesso!";
        }else{
            return "ID do cadastro não encontrado!";
        }
    }
}
