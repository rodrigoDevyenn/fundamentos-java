package com.rodrigoleite.fundamentosjava.aula13.listadeexercicios1;

import java.util.Scanner;

public class Questao15 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA SALARIO MENSAL BRUTO E LIQUIDO.\n");

        System.out.println("Insira o valor por hora: ");
        double valorHora = scan.nextDouble();
        System.out.println("Insira a quantidade de horas mensais: ");
        double qtdHorasMensais = scan.nextDouble();
        scan.close();

        double salarioBruto = valorHora * qtdHorasMensais;
        double descontos = (salarioBruto * 0.11) + (salarioBruto * 0.08) + (salarioBruto * 0.05);
        
        System.out.println("Salário Bruto = R$" + salarioBruto);
        System.out.println("IR(11%) = R$" + (salarioBruto * 0.11));
        System.out.println("INSS(8%) = R$" + (salarioBruto * 0.08));
        System.out.println("Sindicato(5%) = R$" + (salarioBruto * 0.05) );
        System.out.println("Total de descontos = R$" + descontos);
        System.out.println("Salário Liquido = R$" + (salarioBruto - descontos));
    }
}
