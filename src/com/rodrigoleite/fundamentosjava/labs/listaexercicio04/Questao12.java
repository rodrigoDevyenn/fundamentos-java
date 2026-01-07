package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int soma = 0;

        System.out.println("Preenchendo o array:");
        for (int i = 0; i < array.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            array[i] = scan.nextInt();
            soma += array[i];
        }
        scan.close();

        System.out.print("Array = ");
        for (int i =  0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nSoma = " + soma + ".");
    }
}
