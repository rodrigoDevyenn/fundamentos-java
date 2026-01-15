package com.rodrigoleite.fundamentosjava.aula20.labs;

import java.util.Random;

public class Questao01 {

    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        Random numeroAleatorio = new Random();
        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = numeroAleatorio.nextInt(10);
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++){
            System.out.print("Linha " + i + " = ");

            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior:  " + maior + "\nLinha: " + linha + "\nColuna: " + coluna);
    }
}
