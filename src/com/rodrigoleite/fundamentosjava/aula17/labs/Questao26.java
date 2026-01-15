package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao26 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Entre com um número para o calculo de fatorial:");
        int numero = scan.nextInt();
        scan.close();

        System.out.println("Fatorial de " + numero + ":");
        System.out.print(numero + "! = ");
        for (int i = numero; i >= 1; i--){
            if (i == 1){
                System.out.print(i);
            } else {
                System.out.print(i + " . ");
            }
            fatorial *= i;
        }
        System.out.print(" = " + fatorial);
    }
}
