package com.rodrigoleite.fundamentosjava.aula17.labs;

public class Questao23 {

    public static void main(String[] args) {
        
        System.out.println("Loja Quase Dois - Tabela de preços.");

        for (int i = 1; i <= 50; i++){
            System.out.println(i + " - R$ " + (1.99 * i));
        }
    }
}
