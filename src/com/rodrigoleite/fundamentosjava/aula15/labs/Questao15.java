package com.rodrigoleite.fundamentosjava.aula15.labs;

import java.util.Scanner;

public class Questao15 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA DE ESTUDO DOS TRIÂNGULOS.\n");

        System.out.println("Entre com o lado A:");
        double ladoA = scan.nextDouble();
        System.out.println("Entre com o lado B:");
        double ladoB = scan.nextDouble();
        System.out.println("Entre com o lado C:");
        double ladoC = scan.nextDouble();
        scan.close();

        if ((ladoA + ladoB) < ladoC || (ladoA + ladoC) < ladoB || (ladoB + ladoC) < ladoA){
            System.out.println("Os lados não formam um triângulo.");
        } else {
            if (ladoA == ladoB && ladoB == ladoC){
                System.out.println("Triângulo Equilátero.");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA){
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        }
    }
}
