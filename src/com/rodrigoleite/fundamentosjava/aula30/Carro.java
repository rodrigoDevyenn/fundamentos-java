package com.rodrigoleite.fundamentosjava.aula30;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double conCombustivel;

    public Carro(){}

    // Dessa forma, é possivel passar parâmetros ao construtor sem precisar mudar o nome, assim
    // O código fica mais legível e sem confusão pois com o this, enfatizamos que estamos falando
    // dos atributos da classe.

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double conCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.conCombustivel = conCombustivel;
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "  + (this.capCombustivel * this.conCombustivel) + " km");
    }

    double obterAutonomia(){
        return this.capCombustivel * this.conCombustivel;
    }

    double calcularCombustivel(double quilometragem){
        
        double qtdCombustivel = quilometragem / this.conCombustivel;
        return qtdCombustivel;
    }
}
