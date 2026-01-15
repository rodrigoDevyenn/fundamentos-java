package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < a.length;i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            a[i] = scan.nextInt();
            b[i] = a[i];
        }
        scan.close();

        System.out.print("Array A = ");
        for (int i = 0; i < b.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.print("\n");

        System.out.print("Array B = ");
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        
    }
}
