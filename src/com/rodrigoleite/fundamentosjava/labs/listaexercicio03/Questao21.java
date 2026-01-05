package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.util.Scanner;

public class Questao21 {

    public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in);
        int quantAlunos;
        int soma = 0;
        double media;
        boolean turmaInvalida = true;

        System.out.println("Entre com a quantidade de turmas:");
        int quantTurmas = scan.nextInt();

        for (int i = 1; i <= quantTurmas; i++){
            do{ 
                turmaInvalida = true;
                System.out.println("Entre com a quantidade de alunos na " + i + "° turma:");
                quantAlunos = scan.nextInt();
                if (quantAlunos > 40){
                    System.out.println("O limite de alunos em uma turma é 40.Tente novamente!");
                } else {
                    turmaInvalida = false;
                    soma += quantAlunos;
                }
            } while (turmaInvalida);
        }
        scan.close();
        media = soma / quantTurmas;
        System.out.println("Média de alunos por turma: " + media + ".");
    }
}
