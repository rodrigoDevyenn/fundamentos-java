package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[15];
        double[] arrayB = new double[arrayA.length];

        for (int i = 0; i < arrayA.length; i++){

            System.out.println("Entre com o valor da posição " + i + ":" );
            arrayA[i] = scan.nextInt();
            arrayB[i] =  Math.sqrt(arrayA[i]);

        }
        scan.close();

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++){

            System.out.print(arrayA[i] + " ");

        }

        System.out.print("\n");

        System.out.print("Array B = ");
        for (int i = 0; i < arrayB.length; i++){
            
            System.out.print(df.format(arrayB[i]) + " ");

        }
    }
}
