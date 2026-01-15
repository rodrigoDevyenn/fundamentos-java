package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE;
        
        for (int i = 1; i <= 5; i++){
            System.out.println("Entre com o " + i + "° número:");
            numero = scan.nextInt();
            if (numero > maior){
                maior = numero;
            }
        }
        scan.close();

        System.out.println("O maior número lido é " + maior + ".");
    }
}
