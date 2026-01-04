package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA A MEDIA DE UMA ALUNO E RETORNA SEU CONCEITO.\n");

        System.out.println("Entre com a primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota:");
        double nota2 = scan.nextDouble();
        scan.close();

        double media = (nota1 + nota2) / 2;
        String conceito;
        String descricao;
        
        if (media <= 4){
            conceito = "E";
        } else if (media > 4 && media <= 6){
            conceito = "D";
        } else if (media > 6 && media <= 7.5){
            conceito = "C";
        } else if (media > 7.5 && media <= 9){
            conceito = "B";
        } else {
            conceito = "A";
        }

        descricao = switch(conceito){
            case "A" -> "APROVADO";
            case "B" -> "APROVADO";
            case "C" -> "APROVADO";
            case "D" -> "REPROVADO";
            case "E" -> "REPROVADO";
            default -> "Aluno sem nota.";
        };
        
        System.out.println("Nota 1: " + nota1 + ".\nNota 2: " + nota2 + ".\nMédia: " + media + ".\nConceito: " + conceito + ".\nResultado: " + descricao + ".");
    }
}
