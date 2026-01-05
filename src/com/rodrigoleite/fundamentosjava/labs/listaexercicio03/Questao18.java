package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.util.Scanner;

public class Questao18 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int cont = 0;

        System.out.println("Entre com um número inteiro:");
        int numero = scan.nextInt();
        scan.close();

        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                cont++;
            }
        }

        if (cont > 2){
            System.out.println("O número " + numero + " não é primo.");
        } else {
            System.out.println("O número " + numero + " é primo.");
        }
        
    }
}
