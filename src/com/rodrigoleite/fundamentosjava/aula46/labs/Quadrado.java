package com.rodrigoleite.fundamentosjava.aula46.labs;

public class Quadrado extends Figura2D{

    private double lado;

    public Quadrado(){}

    public double calcularArea(){
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    };
}
