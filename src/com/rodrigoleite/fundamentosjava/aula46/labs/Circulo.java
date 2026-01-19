package com.rodrigoleite.fundamentosjava.aula46.labs;

public class Circulo extends Figura2D{

    private double raio;

    public Circulo(){}

    public double calcularArea(){
        return (Math.PI * 2 * raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
