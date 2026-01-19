package com.rodrigoleite.fundamentosjava.aula46.labs;

public class Piramide extends Figura3D {

    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;
    private Figura2D areaBase;

    public Piramide(){}

    @Override
    public double calcularVolume() {
        if (areaBase != null){
            return (areaBase.calcularArea() * altura) / 3;
        }
        return 0;
    }

    @Override
    public double calcularArea() {
        if (areaBase != null){
            return (numPoliBase * ((arestaBase * apotema) / 2)) + areaBase.calcularArea();
        }
        return 0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Figura2D getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(Figura2D areaBase) {
        this.areaBase = areaBase;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    
}
