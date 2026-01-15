package com.rodrigoleite.fundamentosjava.aula32;

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double conCombustivel;

    public Carro(){}

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double conCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.conCombustivel = conCombustivel;
    }

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "  + (this.capCombustivel * this.conCombustivel) + " km");
    }

    public double obterAutonomia(){
        return this.capCombustivel * this.conCombustivel;
    }

    public double calcularCombustivel(double quilometragem){
        return this.dividirKmPorConsumo(quilometragem);
    }
    
    private double dividirKmPorConsumo(double quilometragem){
        return quilometragem / this.conCombustivel;
    }

    // Métodos Getters e Setters
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getNumPassageiros(){
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel(){
        return this.capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel){
        this.capCombustivel = capCombustivel;
    }

    public double getConCombustivel(){
        return this.conCombustivel;
    }

    public void setConCombustivel(double conCombustivel){
        this.conCombustivel = conCombustivel;
    }
}
