package com.rodrigoleite.fundamentosjava.labs.listaexercicio01;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CONVERTE TEMPERATURA EM CELSIUS PARA FARENHEIT.");

        System.out.println("Insira a temperatura em C°: ");
        double grausC = scan.nextDouble();
        scan.close();
        double grausF = ((9 * grausC) / 5) + 32 ;

        System.out.println(grausC + "°C é equivalente a " + grausF + "°F.");
    }
}
