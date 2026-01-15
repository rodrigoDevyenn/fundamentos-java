package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];
        int soma = 0;

        System.out.println("Preenchendo o array A:\n");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            if (arrayA[i] % 5 == 0){
                soma += arrayA[i];
            }
        }
        scan.close();

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("\nSoma dos múltiplos de 5: " + soma + ".");
    }
}
