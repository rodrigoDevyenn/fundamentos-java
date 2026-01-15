package com.rodrigoleite.fundamentosjava.aula13.labs;

import java.util.Scanner;

public class Questao13 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMAQ QUE CALCULA O PESO IDEAL.");

        System.out.println("Informe sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Insira seu peso: ");
        double peso = scan.nextDouble();
        System.out.println("Insira seu sexo(0 - masculino, 1 - feminino): ");
        int sexo = scan.nextInt();
        scan.close();

        if (sexo == 0){
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Para homens da sua altura o peso ideal é " + pesoIdeal + "Kg.");
            if (peso < pesoIdeal){
                System.out.println("Você está abaixo do peso ideal.");
            }else if (peso == pesoIdeal){
                System.out.println("Você está no peso ideal.");
            }else{
                System.out.println("Você está acima do peso ideal.");
            }
        }else{
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Para mulheres da sua altura o peso ideal é de " + pesoIdeal + "Kg.");
            if (peso < pesoIdeal){
                System.out.println("Você está abaixo do peso ideal.");
            }else if (peso == pesoIdeal){
                System.out.println("Você está no peso ideal.");
            }else{
                System.out.println("Você está acima do peso ideal.");
            }
        }
    }
}
