package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE VERIFICA SE UMA LETRA  É VOGAL OU CONSOANTE.\n");

        System.out.println("Insira uma letra:");
        String letra = scan.next();
        scan.close();

        if (letra.length() > 1){
            System.out.println("Não é uma letra válida.");
        } else {
            switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U": System.out.println("Vogal"); break;
            default: System.out.println("Consoante");
        }
        }
    }
}
