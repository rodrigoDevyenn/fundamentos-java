package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.util.Scanner;

public class Questao23 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arrayA = new int[10];

        System.out.println("Preencha o array A:");
        for (int i = 0; i < arrayA.length; i ++){
            System.out.println("Entre com o valor da posição " + i + ":");
            arrayA[i] = scan.nextInt();
            if (arrayA[i] % 2 != 0){
                break;
            }
        }
        scan.close();
    }
}
