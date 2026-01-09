package com.rodrigoleite.fundamentosjava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int qtdFilhos;

        System.out.println("Entre com o número de pessoas entrevistadas:");
        int numeroEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numeroEntrevistados][];
        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Entre com a quantidade de filhos:");
            qtdFilhos = scan.nextInt();
            
            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println("Entre com o nome do filho " + (j+1) + ":");
                nomesFilhos[i][j] = scan.next();
            }
        }
        scan.close();

        for (int i = 0; i < nomesFilhos.length; i++){

            System.out.println("Pessoa " + (i + 1) + " possui " + nomesFilhos[i].length + " filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println("  " + nomesFilhos[i][j]);
            }
        }
        }
}
