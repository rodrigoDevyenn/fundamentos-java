package com.rodrigoleite.fundamentosjava.aula33.labs.questao03;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Entre com o nome do aluno:");
        aluno.setNome(scan.nextLine());

        System.out.println("Entre com a matrícula do aluno:");
        aluno.setMatricula(scan.next());
        scan.nextLine();

        System.out.println("Entre com o curso:");
        aluno.setCurso(scan.nextLine());

        System.out.println("Entre com as disciplinas matrículadas:");
        for (int i = 0; i < aluno.getDisciplinas().length; i++){
            System.out.println("Entre com a disciplina " + (i + 1) + ":");
            aluno.setNomeDisciplinaPos(i, scan.nextLine()); 
        }
        
        for (int i = 0; i < aluno.getNotas().length; i++){
            System.out.println("Entre com as notas da disciplina " + aluno.getDisciplinas()[i] + ":");
            for (int j = 0; j < aluno.getNotas()[i].length; j++){
                System.out.println("Entre com a " + (j + 1) + "° nota:");
                aluno.setNotasPos(i, j, scan.nextDouble());
            }
        }
        aluno.mostrarInfo();

        boolean aberto = true;
        int indice = 0;
        boolean indiceValido = false;

        while (aberto){
            indiceValido = false;
            do{
                System.out.println("1 - " + aluno.getDisciplinas()[0] + "\n2 - " + aluno.getDisciplinas()[1] + "\n3 - " + aluno.getDisciplinas()[2] + "\n0 - Sair");
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
