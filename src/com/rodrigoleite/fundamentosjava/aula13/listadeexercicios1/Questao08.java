package com.rodrigoleite.fundamentosjava.aula13.listadeexercicios1;

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Programa Que Calcula O Salário Mensal.");

        System.out.println("Insira o valor por hora: ");
        double valorPorHora = scan.nextDouble();
        System.out.println("Insira a quantidade de horas mensais: ");
        int qtdHorasMensais = scan.nextInt();
        scan.close();

        double salario = (valorPorHora * qtdHorasMensais);

        System.out.println("O salario mensal é de " + salario);
    }
}
