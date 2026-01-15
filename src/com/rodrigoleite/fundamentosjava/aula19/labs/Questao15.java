package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao15 {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,###");
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];
        int par = 0;
        int impar = 0;
        double percentualPar = 0;
        double percentualImpar = 0;

        System.out.println("Preenchendo o array A:\n");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            if (arrayA[i] % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        scan.close();

        percentualImpar = (impar / (double) arrayA.length) * 100;
        percentualPar = (par / (double) arrayA.length) * 100;

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("\nPercentual de números ímpares: " + df.format(percentualImpar) + "%.");
        System.out.println("Percentual de números pares: " + df.format(percentualPar) + "%.");
    }
}
