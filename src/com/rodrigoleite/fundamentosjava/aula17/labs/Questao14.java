package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao14 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numero;
        int impar = 0;
        int par = 0;
        
        for (int i = 1; i <= 10; i++){
            System.out.println("Entre com o " + i + "° número:");
            numero = scan.nextInt();
            if (numero % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        scan.close();
        
        System.out.println("Números Pares: " + par + ".");
        System.out.println("Números Ímpares: " + impar + ".");
    }
}
