package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao32 {

    public static void main(String[] args) {
        
        Scanner scan =  new Scanner(System.in);
        boolean pedidoFinalizado = false;
        boolean atender = true;
        boolean codigoValido = false;
        int codigo;
        int quantidade;
        String lanche = "";
        double lanchePreco = 0;
        double somaPedido = 0;
        String registro = "";
        int opcao = 0;
        int i = 1;

        while (atender){
            registro += "\nAtendimento " + i + ":\n";
            while(pedidoFinalizado == false){
                do {
                    codigoValido = false;
                    System.out.println("            MENU\nEspecificação  Código    Preço\nCachorro Quente 100      R$ 1,20\nBauru Simples   101      R$ 1,30\nBauru Com Ovo   102      R$ 1,50\nHambúrguer      103      R$1,20\nCheeseBurguer   104      R$ 1,30\nRefrigerante    105      R$ 1,00\nEscolha um item:");
                    codigo = scan.nextInt();
                    switch (codigo) {
                        case 100:
                            lanche = "Cachorro Quente"; lanchePreco = 1.20; codigoValido = true;
                            break;
                        case 101:
                            lanche = "Bauru Simples"; lanchePreco = 1.30; codigoValido = true;
                            break;
                        case 102:
                            lanche = "Bauru Com Ovo"; lanchePreco = 1.50; codigoValido = true;
                            break;
                        case 103:
                            lanche = "Hambúrguer"; lanchePreco = 1.20; codigoValido = true;
                            break;
                        case 104:
                            lanche = "CheeseBurguer"; lanchePreco = 1.30; codigoValido = true;
                            break;
                        case 105:
                            lanche = "Refrigerante"; lanchePreco = 1; codigoValido = true; 
                            break;
                        case 0:
                            codigoValido = true;
                            break;
                        default:
                            System.out.println("Código inválido! Tente novamente.");
                            codigoValido = false;
                    }
                } while (codigoValido == false);

                if (codigo == 0){
                    pedidoFinalizado = true;
                } else{
                    System.out.println("Quantidade:");
                    quantidade = scan.nextInt();

                    somaPedido += (lanchePreco * quantidade);
                    registro += quantidade + "x " + lanche + " Preço = R$ "  + lanchePreco + ".\n";
                }
                


        }
        registro += "Total a pagar: R$ " + somaPedido + ".\n";
        System.out.println(registro);
        System.out.println("1 - Fazer novo pedido.");
        System.out.println("2 - Encerrar e gerar registro");
        opcao = scan.nextInt();
        if (opcao == 1){
            atender = true;
            pedidoFinalizado = false;
            somaPedido = 0;
            i++;
        } else{
            atender = false;
        }
        }
        scan.close();
        System.out.println(registro);
    }
}
