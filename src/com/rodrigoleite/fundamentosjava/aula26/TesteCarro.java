package com.rodrigoleite.fundamentosjava.aula26;

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

        van.exibirAutonomia();

        //Dessa forma os metodos com retorno, podem ter suas chamadas atribuidas a variáveis para serem usadas.
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia + " km");

        //outra forma é simplesmente imprimir a chamada do método
        System.out.println("A autonomia do carro é: " + van.obterAutonomia() + " km");
    }
}
