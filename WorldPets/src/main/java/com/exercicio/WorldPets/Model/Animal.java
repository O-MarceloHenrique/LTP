package com.exercicio.WorldPets.Model;

public class Animal {
    private int id;
    private String raca;
    private String idade;
    private String porte;
    private String genero;
    private String especie;

    public Animal() {
    }
    
    public Animal(String raca, String idade, String porte, String genero, String especie) {
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
        this.genero = genero;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
