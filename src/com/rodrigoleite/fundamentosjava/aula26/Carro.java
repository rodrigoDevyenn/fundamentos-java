package com.rodrigoleite.fundamentosjava.aula26;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "  + (capacidadeCombustivel * consumoCombustivel) + " km");
    }

    double obterAutonomia(){
        return capacidadeCombustivel * consumoCombustivel;
    }
}
