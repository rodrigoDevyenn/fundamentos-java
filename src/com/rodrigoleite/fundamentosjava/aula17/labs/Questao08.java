package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numero;
        int soma = 0;
        double media;

        for (int i = 1; i <= 5; i++){
            System.out.println("Entre com o " + i + "° número:");
            numero = scan.nextInt();
            soma += numero;
        }
        scan.close();

        media = soma / 5;

        System.out.println("Soma: " + soma + ".");
        System.out.println("Média: " + media + ".");
    }
}
