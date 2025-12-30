package com.rodrigoleite.fundamentosjava.aula13;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        
        int valor1 = 1;
        int valor2 = 2;

        //O resultado de operações com operadores relacionais sempre vai ser boolean.
        System.out.println("Valor 1 é igual ao Valor 2? " + (valor1 == valor2));
        System.out.println("Valor 1 é diferente do Valor 2? " + (valor1 != valor2));
        System.out.println("Valor 1 é maior que o Valor 2? " + (valor1 > valor2));
        System.out.println("Valor 1 é maior ou igual ao Valor 2? " + (valor1 >= valor2));
        System.out.println("Valor 1 é menor que o Valor 2? " + (valor1 < valor2));
        System.out.println("Valor 1 é menor ou igual ao Valor 2? " + (valor1 <= valor2));

        
    }
}
