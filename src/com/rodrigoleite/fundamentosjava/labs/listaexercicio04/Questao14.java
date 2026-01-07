package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];
        int cont = 0;
        int soma = 0;
        double media;

        System.out.println("Preenchendo o array A:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            if (arrayA[i] % 2 != 0){
                soma += arrayA[i];
                cont++;
            }
        }
        scan.close();

        media = soma / (double) cont;

        System.out.print("Array A  = ");
        for (int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }

        System.out.println("\nMédia dos números ímpares: " + df.format(media) + ".");
    }
}
