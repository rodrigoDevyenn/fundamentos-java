package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.util.Scanner;

public class Questao37 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[15];
        int[] arrayB = new int[arrayA.length];
        
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com  o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            arrayB[i] = 1;

            for (int j = arrayA[i]; j > 0; j--){
                arrayB[i] *= j;
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
