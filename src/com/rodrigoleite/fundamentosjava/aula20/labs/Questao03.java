package com.rodrigoleite.fundamentosjava.aula20.labs;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int pares = 0;
        int impares =0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Entre com o número da linha " + i + " e coluna " + j + ":");
                matriz[i][j] = scan.nextInt();
                if (matriz[i][j] % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        scan.close();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
