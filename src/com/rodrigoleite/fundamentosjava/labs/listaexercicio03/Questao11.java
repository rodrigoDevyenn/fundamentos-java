package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        
        System.out.println("Entre com o primeiro número:");
        int numero1 = scan.nextInt();

        System.out.println("Entre com o segundo número:");
        int numero2 = scan.nextInt();

        scan.close();

        for (int i = numero1 ; i <= numero2; i++){
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("\nSoma: "+ soma + ".");
    }
}
