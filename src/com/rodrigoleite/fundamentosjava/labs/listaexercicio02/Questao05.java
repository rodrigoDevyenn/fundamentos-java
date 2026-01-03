package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE VERIFICA SE UM ALUNO ESTÁ APROVADO OU REPROVADO.\n");

        System.out.println("Entre com a primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota:");
        double nota2 = scan.nextDouble();
        scan.close();
        
        double media = (nota1 + nota2) / 2;

        if (media < 7){
            System.out.println("Reprovado!");
        } else if (media >= 7 && media < 10){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Aprovado com Distinção!");
        }
    }
}
