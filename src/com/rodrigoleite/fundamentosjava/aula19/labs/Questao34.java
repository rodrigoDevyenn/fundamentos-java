package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.util.Scanner;

public class Questao34 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Relação de números pares de 0 a " + arrayA[i] + ":");
            for (int j = 0; j <= arrayA[i]; j++){
                if (j % 2 == 0){
                    System.out.print("- " + j + "\n");
                }
            }
        }


    }
}
