package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++){

            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            arrayB[i] = arrayA[i] * i;
        
        }
        scan.close();

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++){

            System.out.print(arrayA[i] + " ");

        }

        System.out.print("\n");

        System.out.print("Array B = ");
        for (int i = 0; i < arrayB.length; i++){

            System.out.print(arrayB[i] + " ");

        }

    }
}
