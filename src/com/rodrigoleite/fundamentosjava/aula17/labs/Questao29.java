package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao29 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numero = 1;
        int cont = 0;
        String lista = "";

        System.out.println("Entre com um número inteiro:");
        int n = scan.nextInt();
        scan.close();

        lista += "Números Primos(1 a " + n + ")\n";
        while (numero <= n){

            for (int i = 1; i <= n; i++){
                if (numero % i == 0){
                    cont++;  
                } 
            }
            if (cont <= 2){
                lista += "Número " + numero + ".\n";
            }
            numero++;
            cont = 0;
        }
        System.out.println(lista);
        
    }
}
