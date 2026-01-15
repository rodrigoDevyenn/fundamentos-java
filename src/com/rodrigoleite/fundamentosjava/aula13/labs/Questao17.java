package com.rodrigoleite.fundamentosjava.aula13.labs;

import java.util.Scanner;

public class Questao17 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA ORÇAMENTO PARA PINTURAS");

        System.out.println("Insira a área em metros quadrados:");
        double area = scan.nextDouble();
        scan.close();
        
        for(int i = 0; i < 3; i++){
            if (i == 0){
                System.out.println("Orçamento 01 (Somente Galões de 18L):");
                double litros = (area + (area * 0.10)) / 6;
                double galoes = litros / 18;
                System.out.println(Math.ceil(galoes) + " Galões.");
                System.out.println("Valor = R$" + (Math.ceil(galoes) * 80.0) + ".\n");
            }else if (i == 1){
                System.out.println("Orçamento 02 (Somente Latas de 3.6L):");
                double litros = (area + (area * 0.10)) / 6;
                double latas = litros / 3.6;
                System.out.println(Math.ceil(latas) + " Latas.");
                System.out.println("Valor = R$" + (Math.ceil(latas) * 25.0) + ".\n");
            }else{
                System.out.println("Orçamento 03 (Galões e Latas):");
                double litros = (area + (area * 0.10)) / 6;
                double galoes = (litros / 18) / 2;
                double latas = (litros / 3.6) / 2;
                System.out.println(Math.ceil(galoes) + " Galões.");
                System.out.println(Math.ceil(latas) + " Latas.");
                System.out.println("Valor = R$" + (Math.ceil(galoes) * 80.0) + (Math.ceil(latas) * 25.0) + ".\n");
            }
        }
    }
}
