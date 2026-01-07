package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {
        
        Scanner scan = new  Scanner(System.in);
        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length];

        System.out.println("Preechendo o array A:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
        }

        System.out.println("Preenchendo o array B:");
        for (int i = 0; i < arrayB.length; i++){
            System.out.println("Entre com o valor da posição " + i + "do array B:");
            arrayB[i] = scan.nextInt();
        }
        scan.close();

        for ( int i = 0; i < arrayC.length; i++){
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }
        System.out.print("\n");

        System.out.print("Array B = ");
        for (int i = 0; i < arrayB.length; i++){
            System.out.print(arrayB[i] + " ");
        }
        System.out.print("\n");

        System.out.print("Array C = ");
        for (int i = 0; i < arrayC.length; i++){
            System.out.print(arrayC[i] + " ");
        }

    }
}
