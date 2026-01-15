package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.util.Scanner;

public class Questao17 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];
        int idadesMaior35 = 0;

        System.out.println("Preecha o array com as idades:");
        for (int i = 0; i < idades.length; i++){
            System.out.println("Entre com a " + (i + 1) + "° idade:");
            idades[i] = scan.nextInt();
            if (idades[i] > 35){
                idadesMaior35++;
            }
        }
        scan.close();

        System.out.print("Idades  = ");
        for (int i = 0; i < idades.length; i++){
            System.out.print(idades[i] + " ");
        }
        System.out.println("\nQuantidade de idades maiores que 35: " + idadesMaior35 + ".");
    }
}
