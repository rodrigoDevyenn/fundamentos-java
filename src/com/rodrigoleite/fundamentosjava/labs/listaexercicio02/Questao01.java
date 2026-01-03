package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE INFORMA O NÚMERO MAIOR.\n");

        System.out.println("Informe o primeiro número:");
        double numero1 = scan.nextDouble();
        System.out.println("Informe o segundo número:");
        double numero2 = scan.nextDouble();
        scan.close();

        if (numero1 > numero2){
            System.out.println("O número " + numero1 + " é maior!");
        } else if (numero1 < numero2){
            System.out.println("O número " + numero2 + " é maior!");
        } else {
            System.out.println("Os números são iguais!");
        }

    }
}
