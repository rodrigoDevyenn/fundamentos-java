package com.rodrigoleite.fundamentosjava.labs.listaexercicio01;

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Programa Que Calcula A Área De Um Quadrado E Dobra Seu Valor.");

        System.out.println("Insira os lados do quadrado: ");
        double lado  = scan.nextDouble();
        scan.close();
        double areaQuadrado = Math.pow(lado, 2);
        
        System.out.println("O dobro da area do quadrado é " + (areaQuadrado * 2));
    }
}
