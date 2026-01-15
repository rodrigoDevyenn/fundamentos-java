package com.rodrigoleite.fundamentosjava.aula13.labs;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Programa Para Calcular A Área Da Círculo.");

        System.out.println("Entrada do raio: ");
        double raio = scan.nextDouble();
        scan.close();
        double areaCirculo = 2 * Math.PI * (Math.pow(raio, 2));

        System.out.println("A área do círculo é " + areaCirculo);

    }
}
