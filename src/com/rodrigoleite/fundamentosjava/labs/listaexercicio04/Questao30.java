package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao30 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[20];
        int pares = 0;
        int impares  = 0;
        
        System.out.println("Preenchendo o array A:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            pares += (arrayA[i] % 2 == 0) ? 1 : 0;
            impares += (arrayA[i] % 2 != 0) ? 1 : 0; 
        }
        scan.close();

        int[] arrayB = new int[pares];
        int[] arrayC = new int[impares];

        for (int i = 0, j = 0, k = 0; i < arrayA.length; i++){
            if (arrayA[i] % 2 == 0){
                arrayB[j] = arrayA[i];
                j++;
            } else {
                arrayC[k] = arrayA[i];
                k++;
            }
        }

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("\nTamanho do Array A: " + arrayA.length);

        System.out.print("Array B = ");
        for (int i = 0; i < arrayB.length; i++){
            System.out.print(arrayB[i] + " ");
        }
        System.out.println("\nTamanho do Array B: " + arrayB.length);

        System.out.print("Array C = ");
        for (int i = 0; i < arrayC.length; i++){
            System.out.print(arrayC[i] + " ");
        }
        System.out.println("\nTamanho do Array C: " + arrayC.length);
    }
}
