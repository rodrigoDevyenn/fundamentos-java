package com.rodrigoleite.fundamentosjava.aula13.labs;

import java.util.Scanner;

public class Questao16 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA ORÇAMENTO PARA PINTURA.");

        System.out.println("Insira a area em metros quadrados: ");
        double area = scan.nextDouble();
        scan.close();

        int litros = (int)area / 3;
        int lata = litros / 18;

        System.out.println("Orçamento:\n" + (litros / 18) + "\nValor = R$" + (lata * 80.0));

    }
}
