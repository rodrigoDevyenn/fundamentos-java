package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.util.Scanner;

public class Questao33 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];
        int divisivelCont = 0;
        String registro = "";

        System.out.println("Preenchendo o array A:");
        for (int i = 0; i < arrayA.length; i++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();

            for (int j = 2; j < arrayA[i]; j++){
                if (arrayA[i] % j == 0){
                    divisivelCont++;
                }
            }

            if (divisivelCont == 0){
                registro += arrayA[i] + " - É primo\n";
            } else {
                registro += arrayA[i] + " - Não é primo\n";
            }
            divisivelCont = 0;
        }
        scan.close();

        System.out.println(registro);
    }
}
