package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.util.Scanner;

public class Questao19 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        double media = 0;

        System.out.println("Entre com o número de notas:");
        int qtdNotas = scan.nextInt();

        for (int i = 1; i <= qtdNotas; i++){
            System.out.println("Entre com a " + i + "° nota:");
            soma += scan.nextDouble();
        }
        scan.close();
        media = soma / qtdNotas;
        System.out.println("Média: " + media + ".");
    }
}
