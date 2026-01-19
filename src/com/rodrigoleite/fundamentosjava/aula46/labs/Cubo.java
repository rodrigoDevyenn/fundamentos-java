package com.rodrigoleite.fundamentosjava.aula46.labs;

public class Cubo extends Figura3D {

    private double lado;

    public Cubo(){}

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (lado * lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
}
