package com.rodrigoleite.fundamentosjava.aula13.listadeexercicios1;

import java.util.Scanner;

public class Questao14 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA EXCESSO DE PESO DE PEIXE.");

        System.out.println("Insira o peso de peixes: ");
        double peso = scan.nextDouble();
        scan.close();
        double excesso = 0;
        double multa = 0;
        if (peso > 50.0){
            excesso = peso - 50.0;
            multa = 4 * excesso;
        }
        System.out.println("Excesso: " + excesso + "Kg");
        System.out.println("Multa: R$" + multa);
    }
}
