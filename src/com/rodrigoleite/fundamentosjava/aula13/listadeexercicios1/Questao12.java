package com.rodrigoleite.fundamentosjava.aula13.listadeexercicios1;

import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA O PESO IDEAL.");
        System.out.println("Insira a sua altura: ");
        double altura = scan.nextDouble();
        scan.close();
        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Alguem com uma altura de " + altura + " tem o peso ideal de " + pesoIdeal + "Kg.");
    }
}
