package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao36 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double[] arrayA = new double[11];
        int item;

        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            item = scan.nextInt();
            arrayA[i] =  Math.pow(2, item);
        }
        scan.close();

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }


    }
}
