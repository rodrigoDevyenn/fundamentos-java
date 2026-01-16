package com.rodrigoleite.fundamentosjava.aula34.labs.questao02;

public class Calculadora {

    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static int dividir(int num1, int num2){
        return num1 / num2;
    }

    public static int elevarAPontencia(int base, int exp){
        int total = base;
        for (int i = 1; i < exp; i++){
            total *= total;
        }
        return total;
    }
}
