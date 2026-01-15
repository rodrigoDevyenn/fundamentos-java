package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao17 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int fatorial = 1;
        
        System.out.println("Entre com um número:");
        int numero = scan.nextInt();
        scan.close();

        for (int i = numero; i >= 1; i--){
            fatorial *= i;
        }
        System.out.println(numero + "! = " + fatorial);
    }
}
