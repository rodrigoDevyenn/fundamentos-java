package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao31 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[20];
        int[] arrayB = new int[arrayA.length];
        int pos = 0;

        System.out.println("Preenchendo o array A:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            if (arrayA[i] % 2 ==  0){
                arrayB[pos] = arrayA[i];
                pos++;
            } 
        }
        scan.close();

        for (int i = 0; i < arrayA.length; i++){
            if (arrayA[i] % 2 != 0){
                arrayB[pos] = arrayA[i];
                pos++;
            }
        }

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
