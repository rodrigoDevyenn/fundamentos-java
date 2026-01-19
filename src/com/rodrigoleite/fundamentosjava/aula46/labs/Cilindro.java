package com.rodrigoleite.fundamentosjava.aula46.labs;

public class Cilindro extends Figura3D {

    private double raio;
    private double altura;

    public Cilindro(){}

    @Override
    public double calcularVolume() {
        return Math.PI * raio * raio * altura;
    }

    @Override
    public double calcularArea() {
        double areaBase = (raio * raio * Math.PI );
        double areaLateral = (2 * Math.PI * raio * altura);
        double areaTotal = (areaBase * 2) + areaLateral;
        
        return areaTotal;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
