package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.util.Scanner;

public class Questao22 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double valorCD = 0;
        double soma  = 0;
        double media = 0;

        System.out.println("Entre com o número de Cds:");
        int numCds = scan.nextInt();

        for (int i = 1; i <= numCds; i++){
            System.out.println("Entre com o valor do CD " + i + ":");
            valorCD = scan.nextDouble();
            soma += valorCD;
        }
        scan.close();
        media = soma / numCds;
        System.out.println("Valor Investido: R$" + soma + ".");
        System.out.println("Valor Médio Por CD: R$" + media + ".");
    }
}
