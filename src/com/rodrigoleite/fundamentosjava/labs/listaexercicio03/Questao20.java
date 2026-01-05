package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.util.Scanner;

public class Questao20 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        double media = 0;

        System.out.println("Entre com o número de pessoas:");
        int pessoas = scan.nextInt();

        for (int i = 1; i <= pessoas; i++){
            System.out.println("Qual a idade da " + i + "° pessoa:");
            soma += scan.nextInt();
        }
        scan.close();
        media = soma / pessoas;

        if (media > 0 && media <= 25){
            System.out.println("A turma é jovem!");
            System.out.println("A média das idades da turma está entre 0 e 25 anos.");
        } else if (media > 25 && media <= 60){
            System.out.println("A turma é adulta!");
            System.out.println("A média das idades da turma está entre 26 a 60 anos.");
        } else {
            System.out.println("A turma é idosa!");
            System.out.println("A média das idades da turma é maior que 60 anos.");
        }
    }
}
