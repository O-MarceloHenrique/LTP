package com.exercicio.WorldPets.Model;

public class Resgate {
    private int id;
    private String dataResgate;
    private String localResgate;
    private String descricaoResgate;
    private String animalResgatado;
    
    public Resgate(String dataResgate, String localResgate, String descricaoResgate, String animalResgatado) {
        this.dataResgate = dataResgate;
        this.localResgate = localResgate;
        this.descricaoResgate = descricaoResgate;
        this.animalResgatado = animalResgatado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataResgate() {
        return dataResgate;
    }

    public void setDataResgate(String dataResgate) {
        this.dataResgate = dataResgate;
    }

    public String getLocalResgate() {
        return localResgate;
    }

    public void setLocalResgate(String localResgate) {
        this.localResgate = localResgate;
    }

    public String getDescricaoResgate() {
        return descricaoResgate;
    }

    public void setDescricaoResgate(String descricaoResgate) {
        this.descricaoResgate = descricaoResgate;
    }

    public String getAnimalResgatado() {
        return animalResgatado;
    }

    public void setAnimalResgatado(String animalResgatado) {
        this.animalResgatado = animalResgatado;
    }
}