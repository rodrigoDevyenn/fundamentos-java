
package com.rodrigoleite.fundamentosjava.aula31;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double conCombustivel;

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
    // métodos com modificadores de acesso private, geralmente são usados quando queremos que um 
    // método seja utilizado somente nessa classe, por exemplo, metodos auxiliares de outros.
    private double dividirKmPorConsumo(double quilometragem){
        return quilometragem / this.conCombustivel;
    }
}
