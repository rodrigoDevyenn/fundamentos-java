package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao34 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double resultado = 0;
        

        System.out.println("Entre com o n da sequência:");
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i ++){

            resultado += (double) 1 / i;
            
        }
        System.out.print(resultado);
    }
}
