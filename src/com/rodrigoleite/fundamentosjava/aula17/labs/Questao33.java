package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao33 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double resultado = 0;
        String registro = "";
        

        System.out.println("Entre com o n da sequência:");
        int n = scan.nextInt();
        scan.close();

        for (int i = 1, j = 1; i <= n; i++, j += 2){

            if (i == n){
                registro += i + "/" + j + " = ";
            } else {
                registro += i + "/" + j + " + ";
            }
            resultado += (double) i / j;

        }
        System.out.print(registro);
        System.out.print(resultado);
    }
}
