package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double nota = 0;
        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota de 0 a 10:");
            nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Nota recebida com sucesso!");
            } else {
                System.out.println("Nota inválida! Tente novamente.");
            }
        } while (notaValida == false);
        
        scan.close();
        
    }
}
