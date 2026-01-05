package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int potencia = 1;

        System.out.println("Entre com a base:");
        int base = scan.nextInt();
        System.out.println("Entre com o expoente:");
        int expoente = scan.nextInt();

        scan.close();

        for(int i = 0; i < expoente; i++){
            potencia *= base;
        }
        System.out.println("Potência de " + base + " elevado a " + expoente + " é " + potencia + ".");
    }
}
