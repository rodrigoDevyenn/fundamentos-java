package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao30 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numero;
        int inicio;
        int fim;
        String operacao;
        boolean infoValida = false;

        System.out.println("Entre com o número que deseja ver a tabuada:");
        numero = scan.nextInt();

        do{ 
            System.out.println("Entre com o número no qual a tabuada deve começar:");
            inicio = scan.nextInt();

            System.out.println("Entre com o número no qual a tabuada deve finalizar:");
            fim = scan.nextInt();

            if (inicio > fim){
                System.out.println("Intervalo inválido! O inicio deve ser menor que o fim.");
                infoValida = false;
            } else {
                infoValida = true;
            }
        } while (infoValida == false);

        System.out.println("Entre com a operação da tabuada(+, -, *, /):");
        operacao = scan.next();

        scan.close();

        switch (operacao) {
            case "+":
                System.out.println("Tabuada de " + numero + ":");
                for (int i = inicio; i <= fim; i++){
                    System.out.println(numero + " + " + i + " = " + (numero + i));
                }break;
            case "-":
                System.out.println("Tabuada de " + numero + ":");
                for (int i = inicio; i <= fim; i++){
                    System.out.println(numero + " - " + i + " = " + (numero - i));
                }break;
            case "*":
                System.out.println("Tabuada de " + numero + ":");
                for (int i = inicio; i <= fim; i++){
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }break;
            case "/":
                System.out.println("Tabuada de " + numero + ":");
                for (int i = inicio; i <= fim; i++){
                    System.out.println(numero + " / " + i + " = " + ((double)numero / i));
                }break;
        }  
    }
}
