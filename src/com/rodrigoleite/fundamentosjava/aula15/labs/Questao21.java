package com.rodrigoleite.fundamentosjava.aula15.labs;

import java.util.Scanner;

public class Questao21 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA DE VENDA DE COMBUSTÍVEL.\n");

        System.out.println("Entre com o número de litros:");
        double litros = scan.nextDouble();
        System.out.println("Entre com o tipo de combustível(A - Álcool, G - Gasolina):");
        String tipoCombustível = scan.next();
        scan.close();

        double desconto = 0;
        double valorLitro = 0;
        double valorTotal = 0;

        if (tipoCombustível.equalsIgnoreCase("A")){
            
            if (litros <= 20){
                desconto = 3 / 100;
            } else {
                desconto = 5 /100;
            }
            valorLitro = 1.90;
            valorTotal = (valorLitro + (valorLitro * desconto)) * litros;

        } else if (tipoCombustível.equalsIgnoreCase("G")){
            valorLitro = 2.50;
            if (litros <= 20){
                desconto = 4 / 100;
            } else {
                desconto = 6 / 100;
            }
            valorLitro = 2.50;
            valorTotal = (valorLitro + (valorLitro * desconto)) * litros;
        } else {
            System.out.println("Tipo de Combustível Inválido.");
        }
        System.out.println("O valor a ser pago é de R$" + valorTotal + ".");

    }
}
