package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao35 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Número " + arrayA[i] + ":");
            for (int  j = 2; j < arrayA[i]; j ++){
                if (arrayA[i] % j == 0){
                    System.out.println(" - " + j + " É divisor");
                }
            }
        }

    }
}
