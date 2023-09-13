package com.exercicio.WorldPets.Model;

public class Cadastro {
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public Cadastro(String nome, String endereco, String email, String telefone) {
	    this.nome = nome;
	    this.endereco = endereco;
	    this.email = email;
	    this.telefone = telefone;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
