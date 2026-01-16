package com.rodrigoleite.fundamentosjava.aula35;

public class TesteCalculadora {

    public static void main(String[] args){

        imprimir(Calculadora.fatorialNaoRecursivo(5));
        imprimir(Calculadora.fatorialRecursivo(5));

        imprimir(Calculadora.fatorialNaoRecursivo(7));
        imprimir(Calculadora.fatorialRecursivo(7));
    }

    static void imprimir(int num){
        System.out.println(num);
    }
}
