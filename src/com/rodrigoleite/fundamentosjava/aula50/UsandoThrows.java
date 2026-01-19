package com.rodrigoleite.fundamentosjava.aula50;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args){

        System.out.println("Entre com um número decimal:");
        try {
            double numero = lerNumero();
            System.out.println("Você digitou " + numero);
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
            e.printStackTrace();
        }
    }

    public static double lerNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double numero = scan.nextDouble();
        scan.close();
        return numero;
    }
}
