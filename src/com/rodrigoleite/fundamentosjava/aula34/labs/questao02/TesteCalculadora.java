package com.rodrigoleite.fundamentosjava.aula34.labs.questao02;

public class TesteCalculadora {

    public static void main(String[] args){

        imprimirResultador(Calculadora.somar(4, 2));
        imprimirResultador(Calculadora.subtrair(4, 2));
        imprimirResultador(Calculadora.multiplicar(4, 2));
        imprimirResultador(Calculadora.dividir(4, 2));
        imprimirResultador(Calculadora.elevarAPontencia(4, 2));
 
    }

    static void imprimirResultador(double operacao){
        System.out.println(operacao);
    }

    static void imprimirResultador(int operacao){
        System.out.println(operacao);
    }
}
