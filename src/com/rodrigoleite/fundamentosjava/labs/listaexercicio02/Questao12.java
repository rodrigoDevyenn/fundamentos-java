package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA A FOLHA DE PAGAMENTO DE UMA EMPRESA.\n");
        
        System.out.println("Entre com o valor da hora trabalhada:");
        double valorHora = scan.nextDouble();
        System.out.println("Entre com a quantidade de horas trabalhadas mensalmente:");
        int qtdHorasMensais = scan.nextInt();
        scan.close();

        double salarioBruto = qtdHorasMensais * valorHora;
        double descontoSindicato = salarioBruto * 0.03;
        double descontoFgts = salarioBruto * 0.11;
        double descontoInss = salarioBruto * 0.10;
        double descontoIr;
        double percentualIr;

        if (salarioBruto <= 900){
            percentualIr = 0;
            descontoIr = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            percentualIr = 5;
            descontoIr = salarioBruto * (percentualIr / 100);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
            percentualIr = 10;
            descontoIr = salarioBruto * (percentualIr / 100);
        } else {
            percentualIr = 20;
            descontoIr = salarioBruto * (percentualIr / 100);
        }
        double totalDescontos = descontoInss + descontoIr + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("FOLHA DE PAGAMENTO\nSalário Bruto = R$" + salarioBruto + ".\n(-) IR (" + percentualIr + "%) = R$" + descontoIr + ".\n(-) INSS (10%) = R$" + descontoInss + ".\n(-) Sindicato (3%) = R$" + descontoSindicato + ".\nFGTS (11%) = R$" + descontoFgts + ".\nTotal de Descontos = R$" + totalDescontos + ".\nSalário Liquido = R$" + salarioLiquido + ".");
    }
}
