package com.rodrigoleite.fundamentosjava.aula20;

public class Matrizes {

    public static void main(String[] args) {
        
        // Estamos considerando que cada aluno é representado pelas linhas
        // E as notas são representadas pelas colunas

        double[][] notasAlunos = new double[30][4];
        
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;
    }
}
