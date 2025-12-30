package com.rodrigoleite.fundamentosjava.aula13.listadeexercicios1;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um número x: ");
        int numerox = scan.nextInt();
        System.out.println("Insira um número y: ");
        int numeroy = scan.nextInt();

        System.out.println("A soma entre x e y é " + (numerox + numeroy));
        scan.close();
    }
}
