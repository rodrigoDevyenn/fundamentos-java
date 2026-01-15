package com.rodrigoleite.fundamentosjava.aula15.labs;

import java.util.Scanner;

public class Questao19 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE REALIZA OPERAÇÕES ARITMÉTICAS.\n");

        System.out.println("Entre com o número x:");
        int x = scan.nextInt();
        System.out.println("Entre com o número y:");
        int y = scan.nextInt();
        System.out.println("Entre com a operação que deseja realizar(+ para Adição, - para Subtração, * para Multiplicação, / para Divisão):");
        String operacao = scan.next();
        scan.close();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case "+": resultado = x + y; break;
            case "-": resultado = x - y; break;
            case "*": resultado = x * y; break;
            case "/": resultado = x / y; break;
            default: 
                System.out.println("Operação Inválida!");
                operacaoValida = false;
        }

        if (operacaoValida == true){
            System.out.print(resultado);

            if (resultado % 2 == 0){
                System.out.print(" - Número par e ");}
            else {
                System.out.print(" - Número ímpar e ");}

            if (resultado >= 0){
                System.out.print("positivo.");
            } else {
                System.out.print("negativo.");
            }
        }

        

    }
}
