package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao36 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double[] arrayA = new double[11];

        for (int i = 0; i < arrayA.length; i++){
            arrayA[i] =  Math.pow(2, i);
        }
        scan.close();

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }


    }
}
