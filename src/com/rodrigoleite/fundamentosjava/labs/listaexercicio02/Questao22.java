package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao22 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA DE VENDA DE FRUTAS.\n");

        System.out.println("Entre com a quantidade em Kl de morangos desejados:");
        double morangosKl = scan.nextDouble();
        System.out.println("Entre com a quantidade em Kl de maçãs desejadas:");
        double macasKl = scan.nextDouble();
        scan.close();

        double precoMacaKl = 0;
        double precoMorangoKl = 0;

        if (macasKl <= 5){
            precoMacaKl = 1.80;
        } else {
            precoMacaKl = 1.50;
        }

        if (morangosKl <= 5){
            precoMorangoKl = 2.50;
        } else {
            precoMorangoKl = 2.20;
        }


        double totalEmKl = macasKl + morangosKl;
        double valorTotal = (macasKl * precoMacaKl) + (morangosKl * precoMorangoKl );
        double valorAPagar = 0;
        boolean teveDesconto = false;

    
        if (valorTotal > 25 || totalEmKl > 8){
            valorAPagar = valorTotal - (valorTotal * 0.10);
            teveDesconto = true;
        } else {
            valorAPagar = valorTotal;
            teveDesconto = false;
        }

        if (teveDesconto == true){
            System.out.println("Valor total é de R$" + valorTotal + ", mas você recebeu um desconto de 10%, O valor a pagar é de R$" + valorAPagar + ".");
        } else {
            System.out.println("O valor a pagar é de R$" + valorAPagar + ".");
        }
        
        
    }
}
