package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao24 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];
        boolean palindromo = true;

        System.out.println("Preenchendo o array A:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o número da posição " + i + ":");
            arrayA[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < (arrayA.length) / 2; i++){
            if (arrayA[i] != arrayA[arrayA.length - 1 - i]){
                palindromo = false;
                break;
            }
        }

        if (palindromo){
            System.out.println("O Array A é um palíndromo.");
        } else {
            System.out.println("O Array A não é um palíndromo.");
        }
    }
}
