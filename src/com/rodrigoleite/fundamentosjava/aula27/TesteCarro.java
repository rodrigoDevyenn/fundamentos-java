package com.rodrigoleite.fundamentosjava.aula27;

public class TesteCarro {

    public static void main(String[] args){

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        // Chamada de métodos simples
        van.exibirAutonomia();

        //Dessa forma os metodos com retorno, podem ter suas chamadas atribuidas a variáveis para serem usadas.
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia + " km");

        //outra forma é simplesmente imprimir a chamada do método
        System.out.println("A autonomia do carro é: " + van.obterAutonomia() + " km");

        //Utilizando os métodos com parâmetros;
        double qtdCombustivel10 = van.calcularCombustivel(10);
        System.out.println("Para 10 Km será nescessário " + qtdCombustivel10 + " litros de combustível");
        
        System.out.println("Para 15 Km será nescessário " + van.calcularCombustivel(15) + " litros de combustível");
    }
}
