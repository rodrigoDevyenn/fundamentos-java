package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE DÁ UMA SAUDAÇÃO DE ACORDO COM O TURNO.\n");

        System.out.println("Entre com o turno que você estuda(m - Matutino, v - Vespertino, n - Noturno):");
        String turno  = scan.next();
        scan.close();

        String saudacao = switch(turno){
            case "m" -> "Bom Dia!";
            case "M" -> "Bom Dia!";
            case "v" -> "Boa Tarde!";
            case "V" -> "Boa Tarde!";
            case "n" -> "Boa Noite!";
            case "N" -> "Boa Noite!";
            default -> "Valor Inválido";
        };
        System.out.println(saudacao);
    }
}
