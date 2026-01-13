package com.rodrigoleite.fundamentosjava.labs.listaexercicio07.aluno;

import java.util.Scanner;

public class Questao03TesteAluno {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Entre com o nome do aluno:");
        aluno.nome = scan.nextLine();

        System.out.println("Entre com a matrícula do aluno:");
        aluno.matricula = scan.next();
        scan.nextLine();

        System.out.println("Entre com o curso:");
        aluno.curso = scan.nextLine();

        System.out.println("Entre com as disciplinas matrículadas:");
        for (int i = 0; i < aluno.disciplinas.length; i++){
            System.out.println("Entre com a disciplina " + (i + 1) + ":");
            aluno.disciplinas[i] = scan.nextLine();  
        }
        
        for (int i = 0; i < aluno.notas.length; i++){
            System.out.println("Entre com as notas da disciplina " + aluno.disciplinas[i] + ":");
            for (int j = 0; j < aluno.notas[i].length; j++){
                System.out.println("Entre com a " + (j + 1) + "° nota:");
                aluno.notas[i][j] = scan.nextDouble();
            }
        }

        boolean aberto = true;
        int indice = 0;
        boolean indiceValido = false;

        while (aberto){
            indiceValido = false;
            do{
                System.out.println("1 - " + aluno.disciplinas[0] + "\n2 - " + aluno.disciplinas[1] + "\n3 - " + aluno.disciplinas[2] + "\n0 - Sair");
                System.out.println("Entre com o indice da disciplina que deseja consultar:");
                indice = scan.nextInt();
                if (indice == 1){
                    System.out.println(aluno.verificaAprovado(--indice));
                    indiceValido = true;
                } else if (indice == 2){
                    System.out.println(aluno.verificaAprovado(--indice));
                    indiceValido = true;
                } else if (indice == 3){
                    System.out.println(aluno.verificaAprovado(--indice));
                    indiceValido = true;
                } else if (indice == 0){
                    aberto = false;
                    indiceValido = true;
                } else {
                    System.out.println("Indice inválido! Tente novamente.");
                }
            } while (indiceValido == false);
        }
        scan.close();

    }
}   
