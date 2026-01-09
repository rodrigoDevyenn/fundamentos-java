package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao29 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length * 2];

        System.out.println("Preenchendo o array A:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            arrayC[i] = arrayA[i];
        }

        System.out.println("Preenchendo o array B:");
        for (int i = 0; i < arrayB.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayB[i] = scan.nextInt();
            arrayC[i + arrayA.length] = arrayB[i];
        }
        scan.close();

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }

        System.out.print("\nArray B = ");
        for (int i = 0; i < arrayB.length; i++){
            System.out.print(arrayB[i] + " ");
        }

        System.out.print("\nArray C = ");
        for (int i = 0; i < arrayC.length; i++){
            System.out.print(arrayC[i] + " ");
        }
    }
}
