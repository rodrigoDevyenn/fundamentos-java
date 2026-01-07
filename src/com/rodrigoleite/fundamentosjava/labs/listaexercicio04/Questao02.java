package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] a = new int[8];
        int[] b = new int[8];

        for (int i = 0; i < a.length;i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            a[i] = scan.nextInt();
            b[i] = (a[i] * 2);
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
