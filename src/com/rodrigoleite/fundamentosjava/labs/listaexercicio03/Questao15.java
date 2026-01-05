package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.util.Scanner;

public class Questao15 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int primeiro = 0;
        int segundo = 1;
        int aux;
        
        System.out.println("Entre com o n:");
        int n = scan.nextInt();

        scan.close();

        for (int i = 0; i < n; i++){
            System.out.print(segundo + " ");
            aux = segundo;
            segundo += primeiro;
            primeiro = aux;
            
        }

        //Logica Loianne

        int first = 1;
        int second = 1;
        int next;
        System.out.print("\n" + first + " ");
        System.out.print(second + " ");

        for (int i = 3; i <= n; i++){
            next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
        }
    }
}
