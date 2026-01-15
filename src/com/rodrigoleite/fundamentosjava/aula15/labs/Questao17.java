package com.rodrigoleite.fundamentosjava.aula15.labs;

import java.util.Scanner;

public class Questao17 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA SE UM ANO É BISSEXTO.\n");

        System.out.println("Entre com o ano:");
        int ano = scan.nextInt();
        scan.close();

        if ((ano % 400) == 0){
            System.out.println("O ano de " + ano + " é bissexto.");
        } else if ((ano % 4 ) == 0 && (ano % 100) != 0){
            System.out.println("O ano de " + ano + " é bissexto.");
        } else {
            System.out.println("O ano de " + ano + " não é bissexto.");
        }
    }
}
