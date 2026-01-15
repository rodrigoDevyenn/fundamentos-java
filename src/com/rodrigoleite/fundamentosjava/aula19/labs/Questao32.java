package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao32 {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,###.#");
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[5];
        String operacao;
        boolean operacaoValida = false;

        do{
            System.out.println("Entre com a operação da tabuada(+, -, *, /):");
            operacao = scan.next();
            if (operacao.equalsIgnoreCase("+") || operacao.equalsIgnoreCase("-")){
                operacaoValida = true;
            } else if (operacao.equalsIgnoreCase("*") || operacao.equalsIgnoreCase("/")){
                operacaoValida = true;
            } else {
                operacaoValida = false;
            }
        } while (operacaoValida == false);

        System.out.println("Preenchendo o array A:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
        }
        scan.close();

        switch (operacao) {
            case "+":
                for (int i = 0; i < arrayA.length; i++){
                    System.out.println("\nTabuada de Soma do " + arrayA[i] + ":");
                    for(int j = 1; j <= 10; j++){
                        System.out.println(arrayA[i] + " + " + j + " = " + (arrayA[i] + j));
                    }
                }
                break;

            case "-":
                for (int i = 0; i < arrayA.length; i++){
                    System.out.println("\nTabuada de Subtração do " + arrayA[i] + ":");
                    for(int j = 1; j <= 10; j++){
                        System.out.println(arrayA[i] + " - " + j + " = " + (arrayA[i] - j));
                    }
                }
                break;

            case "*":
                for (int i = 0; i < arrayA.length; i++){
                    System.out.println("\nTabuada de Multiplicação do " + arrayA[i] + ":");
                    for(int j = 1; j <= 10; j++){
                        System.out.println(arrayA[i] + " x " + j + " = " + (arrayA[i] * j));
                    }
                }
                break;

            case "/":
                for (int i = 0; i < arrayA.length; i++){
                    System.out.println("\nTabuada de Divisão do " + arrayA[i] + ":");
                    for(int j = 1; j <= 10; j++){
                        System.out.println(arrayA[i] + " / " + j + " = " + df.format((arrayA[i] / (double) j)));
                    }
                }
                break;
        }
    }
}
