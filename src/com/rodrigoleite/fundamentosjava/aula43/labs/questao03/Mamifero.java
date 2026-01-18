package com.rodrigoleite.fundamentosjava.aula43.labs.questao03;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(){
        super();
        this.setAmbiente("Terra");
        this.setCor("Castanho");
        this.alimento = "Mel";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String toString(){
        String string = super.toString();
        string += "\nAlimento: " + this.alimento;
        return string;
    }
}
