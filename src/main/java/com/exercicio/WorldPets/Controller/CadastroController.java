package com.exercicio.WorldPets.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.WorldPets.Model.Cadastro;
import com.exercicio.WorldPets.Model.CadastroDAO;
import com.exercicio.WorldPets.Repository.CadastroRepository;

@RestController
public class CadastroController {
    @PostMapping("/cadastro")
    public void cadastrarUsuario(@RequestBody Cadastro cadastro) {
        CadastroRepository.addDado(cadastro);
    }

    @GetMapping("/cadastro")
    public List<Cadastro> recuperarUsuario() {
        CadastroDAO rel = CadastroDAO.getInstance();
        List<Cadastro> cadastros = rel.findAll();
        return cadastros;
    }

    @DeleteMapping("/cadastro")
    public void deletarUsuario(@RequestBody Cadastro cadastro){
        CadastroRepository.deletar(cadastro);
    }
}
