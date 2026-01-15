package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.util.Scanner;

public class Questao26 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length];

        System.out.println("Preenchendo o array A:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
        }

        System.out.println("Prenchendo o array B:");
        for (int i = 0; i < arrayB.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayB[i] = scan.nextInt();
            if (arrayA[i] > arrayB[i]){
                arrayC[i] = 1;
            }
            else if (arrayA[i] == arrayB[i]){
                arrayC[i] = 0;
            }
            else {
                arrayC[i] = -1;
            }
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
