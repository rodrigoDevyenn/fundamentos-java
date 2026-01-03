package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args){

        Scanner  scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE RECEBE 3 NÚMEROS E RETORNA O MAIOR E O MENOR.\n");

        System.out.println("Entre com o primeiro número:");
        double numero1 = scan.nextDouble();
        System.out.println("Entre com o segundo número:");
        double numero2 = scan.nextDouble();
        System.out.println("Entre com o terceiro número:");
        double numero3 = scan.nextDouble();
        scan.close();
        
        //maior
        if (numero1 >= numero2 && numero1 >= numero3){
            System.out.println("O número 1 é o maior: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3){
            System.out.println("O número 2 é o maior: " + numero2);
        } else if (numero3 >= numero1 && numero3 >= numero2) {
            System.out.println("O número 3 é o maior: " + numero3);
        }
        
        //menor
        if (numero1 <= numero2 && numero1 <= numero3){
            System.out.println("O número 1 é o menor: " + numero1);
        } else if (numero2 <= numero1 && numero2 <= numero3){
            System.out.println("O número 2 é o menor: " + numero2);
        } else if (numero3 <= numero1 && numero3 <= numero2) {
            System.out.println("O número 3 é o menor: " + numero3);
        }
    }
}
