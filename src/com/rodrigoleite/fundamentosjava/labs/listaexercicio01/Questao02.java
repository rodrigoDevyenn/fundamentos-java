package com.rodrigoleite.fundamentosjava.labs.listaexercicio01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int numero = scan.nextInt();
        scan.close();

        System.out.println("O número informado foi " + numero);
        
    }
}
