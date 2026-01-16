package com.rodrigoleite.fundamentosjava.aula34.labs.questao03;

public class TesteCalculadora {

    public static void main(String[] args){

        imprimirResultado(Calculadora.somar(4, 2));
        imprimirResultado(Calculadora.subtrair(4, 2));
        imprimirResultado(Calculadora.multiplicar(4, 2));
        imprimirResultado(Calculadora.dividir(4, 2));
        imprimirResultado(Calculadora.elevarAPontencia(4, 2));
        imprimirResultado(Calculadora.fatorial(5));
 
    }

    static void imprimirResultado(double operacao){
        System.out.println(operacao);
    }

    static void imprimirResultado(int operacao){
        System.out.println(operacao);
    }
}
