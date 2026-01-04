package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao16 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA EQUAÇÃO DO 2° NA FORMA ax^2 + bx +c.\n");

        System.out.println("Entre com o valor de a:");
        double a  = scan.nextDouble();
        if (a == 0){
            System.out.println("Para que a equação seja do 2°grau, a deve ser diferente de 0.");
        } else {
            System.out.println("Entre com o valor de b:");
            double b = scan.nextDouble();
            System.out.println("Entre com o valor de c:");
            double c  = scan.nextDouble();
            scan.close();

            double delta = (Math.pow(b, 2)) - (4 * a * c);
            
            if (delta < 0){
                System.out.println("Como o delta é negativo, a equação não possui raizes reais.");
            } else if (delta == 0) {
                double x = ((-b) + (Math.sqrt(delta))) / (2*a);
                System.out.println("A equação possui apenas uma raiz real: X = " + x +".");
            } else {
                double x1 = ((-b) + (Math.sqrt(delta))) / (2*a);
                double x2 = ((-b) - (Math.sqrt(delta))) / (2*a);
                System.out.println("A equação possui duas raizes reais: X = " + x1 + " e X = " + x2 + ".");
            }
        }
    }
}
