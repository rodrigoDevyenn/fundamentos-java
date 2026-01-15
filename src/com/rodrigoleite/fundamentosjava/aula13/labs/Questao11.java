package com.rodrigoleite.fundamentosjava.aula13.labs;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROBLEMAS MATEMÁTICOS.\nA) O PRODUTO DO DOBRO DO PRIMEIRO COM METADE DO SEGUNDO.\nB) A SOMA DO TRIPLO DO PRIMEIRO COM O TERCEIRO.\nC) O TERCEIRO ELEVADO AO CUBO.\n");

        System.out.println("Insira o primeiro número(Deve ser um inteiro): ");
        int num1 = scan.nextInt();
        System.out.println("Insira o segundo número(Deve ser um inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Insira o terceiro número(Deve ser de ponto flutuante): ");
        double num3 = scan.nextDouble();
        scan.close();

        System.out.println("A) Resposta = " + ((num1 * 2) * (num2 / 2)));
        System.out.println("B) Resposta = " + ((num1 * 3) + (num3)));
        System.out.println("C) Resposta = " + (Math.pow(num3, 3)));
    }
}
