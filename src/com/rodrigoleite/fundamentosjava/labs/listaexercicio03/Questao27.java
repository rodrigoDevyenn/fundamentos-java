package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.util.Scanner;

public class Questao27 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean sair = false;
        int i = 1;
        double temperatura;
        double soma = 0;
        double media =0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        while (sair == false){
            System.out.println("Entre com a temperatura " + i + ":");
            temperatura = scan.nextDouble();
            if (temperatura != 0){
                if (temperatura > maior){
                    maior = temperatura;}
                if (temperatura < menor){
                    menor = temperatura;}
                soma += temperatura;
                i++;
                sair = false;
            } else {
                sair = true;
            }
        }
        scan.close();
        media = soma / i;
        System.out.println("Maior temperatura: " + maior + "°C");
        System.out.println("Menor temperatura: " + menor + "°C");
        System.out.println("Temperatura Média: " + media + "°C");
    }
}
