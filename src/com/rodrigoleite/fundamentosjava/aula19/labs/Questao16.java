package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao16 {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];
        int somaInf = 0;
        int somaSup = 0;
        int qtdIguais = 0;
        int qtdSup = 0;
        double media;

        System.out.println("Preenchendo o array A:\n");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            if (arrayA[i] < 15){
                somaInf += arrayA[i];
            } else if (arrayA[i] == 15) {
                qtdIguais++;
            } else {
                somaSup += arrayA[i];
                qtdSup++;
            }
        }
        scan.close();

        media = (double) somaSup / qtdSup;

        System.out.print("\nArray A = ");
        for (int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("\nSoma dos números inferiores a 15: " + somaInf + ".");
        System.out.println("Quantidade dos números iguais a 15: " + qtdIguais + ".");
        System.out.println("Media dos números superiores a 15 " + df.format(media) + ".");
    }
}
