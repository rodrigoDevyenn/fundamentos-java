package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.util.Scanner;

public class Questao27 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];
        char[] arrayB = new char[arrayA.length];

        System.out.println("Preenchendo o array A:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();

            if (arrayA[i] < 7){
                arrayB[i] = 'a';
            } else if (arrayA[i] == 7){
                arrayB[i] = 'b';
            } else if (arrayA[i] > 7 && arrayA[i] < 10){
                arrayB[i] = 'c';
            } else if (arrayA[i] == 10){
                arrayB[i] = 'd';
            } else {
                arrayB[i] = 'e';
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
    }
}
