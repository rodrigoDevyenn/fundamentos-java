package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[15];
        int[] arrayB = new int[15];

        for (int i = 0; i < arrayA.length; i++){
            
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            arrayB[i] = (int) Math.pow(arrayA[i], 2);  

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
