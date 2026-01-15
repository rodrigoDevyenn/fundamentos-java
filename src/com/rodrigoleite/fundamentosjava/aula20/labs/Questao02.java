package com.rodrigoleite.fundamentosjava.aula20.labs;

import java.util.Random;

public class Questao02 {

    public static void main(String[] args) {
        
        int[][] matriz = new int[10][10];
        Random numeroAleatorio = new Random();
        int maiorLin = Integer.MIN_VALUE;
        int menorLin = Integer.MAX_VALUE;
        int maiorCol = Integer.MIN_VALUE;
        int menorCol = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++){
            
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = numeroAleatorio.nextInt(10);

                if (i == 5 && matriz[i][j] > maiorLin){
                    maiorLin = matriz[i][j];
                }
                if (i == 5 && matriz[i][j] < menorLin){
                    menorLin = matriz[i][j];
                }
                if (j == 7 && matriz[i][j] > maiorCol){
                    maiorCol = matriz[i][j];
                }
                if (j == 7 && matriz[i][j] < menorCol){
                    menorCol = matriz[i][j];
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

        System.out.println("Maior da Linha 5: " + maiorLin + "\nMenor da Linha 5: " + menorLin);
        System.out.println("Maior da Coluna 7: " + maiorCol + "\nMenor da Coluna 7: " + menorCol);
    }
}
