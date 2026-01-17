package com.rodrigoleite.fundamentosjava.aula36.labs.questao02;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, Seja Bem-vindo(a), vamos abrir um novo curso!\n");
        Curso curso = new Curso();
        
        System.out.println("Qual o nome do curso?");
        curso.setNomeCurso(scan.nextLine());

        System.out.println("Entre com o horário do curso: ");
        curso.setHorario(scan.nextLine());

        System.out.println("Agora vamos definir um professor para o curso!\n");
        Professor professor = new Professor();

        System.out.println("Entre com o nome do professor:");
        professor.setNome(scan.nextLine());

        System.out.println("Entre com o departamento do professor:");
        professor.setDepartamento(scan.nextLine());

        System.out.println("Entre com o e-mail do professor: ");
        professor.setEmail(scan.nextLine());

        curso.setProfessor(professor);

        System.out.println("Perfeito, é hora de matricular os alunos!\n");
        
        for (int i = 0; i < 5; i++){
            System.out.println("Entre com os dados do " + (i + 1) + "° aluno:");
            Aluno aluno = new Aluno();

            System.out.println("Nome:");
            aluno.setNome(scan.nextLine());

            System.out.println("Matrícula:");
            aluno.setMatricula(scan.nextLine());

            for (int j = 0; j < 4; j++){
                System.out.println("Nota " + (j + 1) + ":");
                aluno.getNotas()[j] = scan.nextDouble();
            }
            scan.nextLine();
            curso.cadastrarAluno(aluno);
        }
        scan.close();
        System.out.println(curso.mostrarTurma());
        System.out.println("\nMedia da Turma = " + curso.mostarMediaTurma() + ".");




        
        
    }
}
