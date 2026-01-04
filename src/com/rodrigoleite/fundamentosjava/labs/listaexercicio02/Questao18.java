package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao18 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE VERIFICA SE UMA DATA É VÁLIDA.\n");

        System.out.println("Entre com um número inteiro:");
        int numero = scan.nextInt();
        scan.close();

        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par.");
        } else{
            System.out.println("O número " + numero + " é ímpar.");
        }
        
    }
}
