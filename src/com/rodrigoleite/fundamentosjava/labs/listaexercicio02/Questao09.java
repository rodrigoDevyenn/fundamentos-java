package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE ORDENA 3 NÚMEROS EM ORDEM DECRESCENTE.\n");

        System.out.println("Insira o primeiro número:");
        double numero1 = scan.nextDouble();
        System.out.println("Insira o segundo número:");
        double numero2 = scan.nextDouble();
        System.out.println("Insira o terceiro número:");
        double numero3 = scan.nextDouble();
        scan.close();


        if (numero1 >= numero2 && numero1 >= numero3){
            if (numero2 >= numero3){
                System.out.println("Número 1 , Número 2, Número 3.");
            } else{
                System.out.println("Número 1, Número 3, Número 2");
            }
        } else if (numero2 >= numero1 && numero2 >= numero3){
            if (numero1 >= numero3){
                System.out.println("Número 2 , Número 1, Número 3.");
            } else{
                System.out.println("Número 2, Número 3, Número 1");
            }
        } else if (numero3 >= numero1 && numero3 >= numero2){
            if (numero1 >= numero2){
                System.out.println("Número 3 , Número 1, Número 2.");
            } else{
                System.out.println("Número 3, Número 2, Número 1");
            }
        }
    }
}
