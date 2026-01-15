package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número que deseja ver a tabuada:");
        int numero = scan.nextInt();

        System.out.println("Entre com a operação da tabuada(+, -, *, /):");
        String operacao = scan.next();

        scan.close();

        switch (operacao) {
            case "+":
                System.out.println("Tabuada de " + numero + ":");
                for (int i = 1; i <= 10; i++){
                    System.out.println(numero + " + " + i + " = " + (numero + i));
                }break;
            case "-":
                System.out.println("Tabuada de " + numero + ":");
                for (int i = 1; i <= 10; i++){
                    System.out.println(numero + " - " + i + " = " + (numero - i));
                }break;
            case "*":
                System.out.println("Tabuada de " + numero + ":");
                for (int i = 1; i <= 10; i++){
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }break;
            case "/":
                System.out.println("Tabuada de " + numero + ":");
                for (int i = 1; i <= 10; i++){
                    System.out.println(numero + " / " + i + " = " + ((double)numero / i));
                }break;
        }  
    }
}
