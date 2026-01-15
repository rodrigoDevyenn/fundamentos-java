package com.rodrigoleite.fundamentosjava.aula17.labs;

public class Questao24 {

    public static void main(String[] args) {

        System.out.println("Preço do pão: R$ 0.18\nPanificadora Pão de Ontem - Tabela de preços.");

        for (int i = 1; i <= 50; i++){
            System.out.println(i + " - R$ " + (0.18 * i));
        }
    }
}
