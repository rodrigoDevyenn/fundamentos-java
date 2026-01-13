package com.rodrigoleite.fundamentosjava.labs.listaexercicio07.aluno;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[3][4];

    void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        
        for (int i = 0; i < notas.length; i++){
            System.out.print(disciplinas[i] + " = ");
            for (int j = 0; j < notas[i].length; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    String verificaAprovado(int indice ){
        double media = calcularMedia(indice);
        if (media >= 7){
            return "Aprovado";
        } 
        return "Reprovado";
    }

    double calcularMedia(int indice){
        double soma = 0;
        double media;
        for (int i = 0; i < notas[indice].length; i++){
            soma += notas[indice][i];
        }
        media = soma / 4;
        return media;
    }

    
}
