package com.rodrigoleite.fundamentosjava.aula35.labs.questao02;

public class TesteSomatorio {

    public static void main(String[] args){

        for (int i = 1; i <= 5; i++){
            System.out.print(i + " + ");
        }
        System.out.print(" = " + Somatorio.somatorio(5));
        
    }
}
