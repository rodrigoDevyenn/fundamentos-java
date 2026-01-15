package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao25 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double precoProduto;
        boolean calcular = false;
        boolean atender = true;
        String registro = "";
        double soma = 0;
        double dinheiro = 0; 
        double troco = 0;
        int opcao;
        int atendimento = 1;       

        while (atender){

            
            registro += "\nLojas Tabajara - Atendimento " + atendimento + ":\n";
            int i = 1;
            soma = 0;
            calcular = false;
            
            while (calcular == false){
                System.out.println("Valor do produto " + i + ":");
                precoProduto = scan.nextDouble();
                if (precoProduto == 0){
                    calcular = true;
                } else {
                    registro += "Produto " + i + ": R$ " + precoProduto + ".\n";
                    soma += precoProduto;
                    calcular = false;
                    i++;
                }
            }
            registro += "Total: R$ " + soma + ".\n";
            System.out.println(registro);
            System.out.println("Entre com o dinheiro:");
            dinheiro = scan.nextDouble();
            troco = dinheiro - soma;
            registro += "Dinheiro: R$ " + dinheiro + ".\n";
            registro += "Troco: R$ " + troco + ".\n";
            System.out.println("Troco: R$ " + troco + ".");
            
            System.out.println("1 - Proximo atendimento.");
            System.out.println("2 - Encerrar atendimentos.");
            opcao = scan.nextInt();
            if (opcao == 1){
                atender = true;
                atendimento++;
            } else {
                atender  = false;
            }
        }
        scan.close();
        System.out.println(registro);
    }
}
