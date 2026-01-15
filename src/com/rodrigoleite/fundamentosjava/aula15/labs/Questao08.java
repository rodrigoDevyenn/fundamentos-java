package com.rodrigoleite.fundamentosjava.aula15.labs;

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE INFORMA QUAL O PRODUTO MAIS BARATO.\n");

        System.out.println("Insira o valor do primeiro produto:");
        double produto1 = scan.nextDouble();
        System.out.println("Insira o valor do segundo produto:");
        double produto2 = scan.nextDouble();
        System.out.println("Insira o valor do terceiro produto:");
        double produto3 = scan.nextDouble();
        scan.close();

        if (produto1 <= produto2 && produto1 <= produto3){
            System.out.println("Você deve comprar o produto 1.");
        } else if (produto2 <= produto1 && produto2 <= produto3){
            System.out.println("Você deve comprar o produto 2.");
        } else if (produto3 <= produto1 && produto3 <= produto2){
            System.out.println("Você deve comprar o produto 3");
        }
    }
}
