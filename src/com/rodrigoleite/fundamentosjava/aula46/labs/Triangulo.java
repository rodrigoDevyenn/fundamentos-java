package com.rodrigoleite.fundamentosjava.aula46.labs;

public class Triangulo extends Figura2D{

    private double base;
    private double altura;

    public Triangulo(){}

    public double calcularArea(){
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
