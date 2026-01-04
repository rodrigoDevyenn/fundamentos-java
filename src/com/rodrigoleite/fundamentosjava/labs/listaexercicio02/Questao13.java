package com.rodrigoleite.fundamentosjava.labs.listaexercicio02;

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE INFORMA O DIA DA SEMANA.\n");

        System.out.println("Entre com um dia da semana(1-7):");
        int diaSemana = scan.nextInt();
        scan.close();

        String resposta = switch(diaSemana){
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Valor Inválido!";
        };
        System.out.println(resposta);
    }
}
