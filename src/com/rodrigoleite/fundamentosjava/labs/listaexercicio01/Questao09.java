package com.rodrigoleite.fundamentosjava.labs.listaexercicio01;

import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CONVERTE TEMPERATURA EM GRAUS FARENHEIT PARA CELSIUS.");

        System.out.println("Insira a temperatura em F°: ");
        double grausF = scan.nextDouble();
        scan.close();
        
        double grausC = (5 * (grausF - 32))/9;

        System.out.println(grausF + "°F é equivalente a " + grausC + "°C.");
    }
}
