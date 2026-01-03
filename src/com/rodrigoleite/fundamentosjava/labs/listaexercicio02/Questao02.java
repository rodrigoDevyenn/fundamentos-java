package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao02 {

    public static  void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE VERIFICA SE UM NÚMERO É POSITIVO OU NEGATIVO.\n");

        System.out.println("Informe o número:");
        double numero = scan.nextDouble();
        scan.close();

        if (numero >= 0){
            System.out.println("O número informado é positivo.");
        } else {
            System.out.println("O número informado é negativo.");
        }
    }
}
