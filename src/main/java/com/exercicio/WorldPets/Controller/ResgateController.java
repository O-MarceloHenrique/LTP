package com.exercicio.WorldPets.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.WorldPets.Model.Resgate;
import com.exercicio.WorldPets.Model.ResgateDAO;
import com.exercicio.WorldPets.Repository.ResgateRepository;

@RestController
public class ResgateController {
    @PostMapping("/resgate")
    public void endPoint1(@RequestBody Resgate resgate) {
        ResgateDAO resg = ResgateDAO.getInstance();
        resg.criar(resgate);
    }

    @GetMapping("/resgate")
    public List<Resgate> endPoint2() {
        ResgateDAO rel = ResgateDAO.getInstance();
        List<Resgate> cadastros = rel.mostrar();
        return cadastros;
    }

    @DeleteMapping("/resgate")
    public void endPoint3(@RequestBody Resgate resgate){
        ResgateRepository.deletar(resgate);
    }
}
