package com.rodrigoleite.fundamentosjava.aula14;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a sua idade:");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Nãõ é maior de idade.");
        }

        // valor <= 10 - barato
        // 10 < valor < 15 - pode pedir um desconto
        // 15 <= valor < 17 - Pode pesquisar mais
        // 17 <= valor - Muito caro.

        double valor = scan.nextDouble();

        if (valor <= 10){
            System.out.println("Está barato, pode comprar!");
        } else if (valor > 10 && valor < 15){
            System.out.println("Dá pra pedir um desconto!");
        } else if (valor >= 15 && valor < 17){
            System.out.println("Dá pra pesquisar mais!");
        } else { // valor >= 17
            System.out.println("Sai fora! Muito caro!");
        }
        scan.close();

    }
}
