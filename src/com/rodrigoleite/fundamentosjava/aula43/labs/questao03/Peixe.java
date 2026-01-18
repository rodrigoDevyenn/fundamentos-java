package com.rodrigoleite.fundamentosjava.aula43.labs.questao03;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe(){
        super();
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzento");
        this.caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String toString(){
        String string = super.toString();
        string += "\nCaracterística: " + this.caracteristicas + ".";
        return string; 
    }
}
