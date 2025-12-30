package com.rodrigoleite.fundamentosjava.aula13.listadeexercicios1;

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Programa De Conversão De Métros Para Centimétros.");

        System.out.println("Entrada em métros: ");
        double metros = scan.nextDouble();
        double cm = metros * 100;

        System.out.println(metros + " metros é equivalente a " + cm + " centimétros.");

    }
}
