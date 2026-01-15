package com.rodrigoleite.fundamentosjava.aula29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    //Método Construtor Vazio
    Carro(){
        
    }

    //Método Construtor
    Carro(String marca_, String modelo_, int numP, double capC, double conC){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numP;
        capacidadeCombustivel = capC;
        consumoCombustivel = conC;
    }

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
