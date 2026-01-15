package com.rodrigoleite.fundamentosjava.aula15.labs;

import java.util.Scanner;

public class Questao23 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE GERA CUMPOM FISCAL.\n");

        System.out.println("Insira o tipo de carne desejada:(F - Filé Duplo, A - Alcatra, P - Picanha");
        String tipoCarne = scan.next();

        System.out.println("Insira a quantidade de carne em Kl:");
        double qtdKlCarne = scan.nextDouble();

        System.out.println("Insira a forma de pagamento:(C - Cartão Comum,T - artão Tabajara, P - PIX, D - Dinheiro");
        String formaPagamento = scan.next();
        scan.close();

        double precoKlCarne = 0;
        String carneDescricao = "";

        switch (tipoCarne) {
            case "f":
            case "F":
                carneDescricao = "Filé Duplo";
                if (qtdKlCarne <= 5){
                    precoKlCarne = 4.9;
                } else {
                    precoKlCarne = 5.8;
                } break;
            case "a":
            case "A":
                carneDescricao = "Alcatra";
                if (qtdKlCarne <= 5){
                    precoKlCarne = 5.9;
                } else {
                    precoKlCarne = 6.8;
                } break;
            case "p":
            case "P":
                carneDescricao = "Picanha";
                if (qtdKlCarne <= 5){
                    precoKlCarne = 6.9;
                } else {
                    precoKlCarne = 7.8;
                } break;
            default:
                System.out.println("Tipo de carne inválido.");
        }

        double valorParcial = (precoKlCarne * qtdKlCarne);
        double percentualDesconto =  5;
        double valorDesconto = 0;
        String formaPagamentoDescricao = "";
        double valorTotal = valorParcial;

        if (formaPagamento.equalsIgnoreCase("T")){
            valorDesconto = valorParcial * (percentualDesconto / 100);
            valorTotal = valorParcial - valorDesconto;
            formaPagamentoDescricao = "Cartão Tabajara";
        } else if (formaPagamento.equalsIgnoreCase("C")){
            formaPagamentoDescricao = "Cartão Comum";
        } else if (formaPagamento.equalsIgnoreCase("P")){
            formaPagamentoDescricao = "Pix";
        } else if (formaPagamento.equalsIgnoreCase("D")){
            formaPagamentoDescricao = "Cash";
        } else {
            System.out.println("Forma de pagamento inválida.");
        }

        System.out.println("CUPOM FISCAL");
        System.out.println("Tipo de carne: " + carneDescricao + ".");
        System.out.println("Quantidade de carne(Kg): " + qtdKlCarne + ".");
        System.out.println("Preço Total: R$" + valorParcial + ".");
        System.out.println("Forma de Pagamento:" + formaPagamentoDescricao + ".");
        System.out.println("Desconto: R$" + valorDesconto + ".");
        System.out.println("Valor a Pagar: R$" + valorTotal + ".");
    }
}
