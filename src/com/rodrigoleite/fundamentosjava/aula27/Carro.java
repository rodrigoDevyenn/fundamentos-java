package com.rodrigoleite.fundamentosjava.aula27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    //metodo simples
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "  + (capacidadeCombustivel * consumoCombustivel) + " km");
    }

    //metodo com retorno
    double obterAutonomia(){
        return capacidadeCombustivel * consumoCombustivel;
    }

    //metodo com parâmetros
    double calcularCombustivel(double quilometragem){
        
        double qtdCombustivel = quilometragem / consumoCombustivel;
        return qtdCombustivel;
    }
}
