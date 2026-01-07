package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao18 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];
        int maior = Integer.MIN_VALUE;
        int maiorIndice = -1;
        int menor = Integer.MAX_VALUE;
        int menorIndice = -1;

        System.out.println("Preencha o vetor com as idades:\n");
        for (int i = 0; i < idades.length; i++){
            System.out.println("Entre com a " + (i + 1) + "° idade:");
            idades[i] = scan.nextInt();
            if (idades[i] > maior){
                maior = idades[i];
                maiorIndice = i;
            }
            if (idades[i] < menor){
                menor = idades[i];
                menorIndice = i;
            }
        }
        scan.close();

        System.out.print("Idades = ");
        for (int i = 0; i < idades.length; i++){
            System.out.print(idades[i] + " ");
        }

        System.out.println("\nMaior idade: " + maior + " - Indice: " + maiorIndice + ".");
        System.out.println("Menor idade: " +  menor + " - Indice: " + menorIndice + ".");
    }
}
