package com.rodrigoleite.fundamentosjava.aula15.labs;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA OS REAJUSTES DE SALÁRIO.\n");

        System.out.println("Entre com o salário:");
        double salario = scan.nextDouble();
        scan.close();
        
        if (salario <= 280){
            double reajuste = salario * 0.20;
            double salarioNovo = salario + reajuste;
            System.out.println("Salário Antigo: R$" + salario + ".\nPercentual do Reajuste: " + 20 + "%.\nValor do Reajuste: R$" + reajuste + ".\nSalário Reajustado: R$" + salarioNovo + ".");
        } else if (salario > 280 && salario <= 700){
            double reajuste = salario * 0.15;
            double salarioNovo = salario + reajuste;
            System.out.println("Salário Antigo: R$" + salario + ".\nPercentual do Reajuste: " + 15 + "%.\nValor do Reajuste: R$" + reajuste + ".\nSalário Reajustado: R$" + salarioNovo + ".");
        } else if (salario > 700 && salario <= 1500){
            double reajuste = salario * 0.10;
            double salarioNovo = salario + reajuste;
            System.out.println("Salário Antigo: R$" + salario + ".\nPercentual do Reajuste: " + 10 + "%.\nValor do Reajuste: R$" + reajuste + ".\nSalário Reajustado: R$" + salarioNovo + ".");
        } else {
            double reajuste = salario * 0.05;
            double salarioNovo = salario + reajuste;
            System.out.println("Salário Antigo: R$" + salario + ".\nPercentual do Reajuste: " + 5 + "%.\nValor do Reajuste: R$" + reajuste + ".\nSalário Reajustado: R$" + salarioNovo + ".");
        }
    }
}
