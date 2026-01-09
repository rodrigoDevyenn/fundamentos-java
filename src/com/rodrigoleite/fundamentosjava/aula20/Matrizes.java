package com.rodrigoleite.fundamentosjava.aula20;

public class Matrizes {

    public static void main(String[] args) {
        
        // Estamos considerando que cada aluno é representado pelas linhas
        // E as notas são representadas pelas colunas

        double[][] notasAlunos = new double[3][4];
        
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

        //Como fazer o Output de matrizes bi-dimensionais

        for (int i = 0; i < notasAlunos.length; i++){
            System.out.print("\nAluno  " + i + " = ");
            for (int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " ");
            }
        }
        System.out.println();

        // Fazendo a média das notas de cada aluno:
        double soma;
        for (int i = 0; i < notasAlunos.length; i++){

            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("A média do aluno " + i + ": " + (soma / 4));
        }

        System.out.println();

        //Como inicializar arrays e matrizes já com seus elementos:

        double[] notasAluno1 = {9, 10, 8, 6}; // array preechido
        double[][] notasAlunos2 = {{9, 10, 8, 6}, {10, 6, 5, 7}, {10, 10, 9.5, 10}}; //array preenchido com varios arrays preenchidos;

        
        for (int i = 0; i < notasAlunos2.length; i++){
            System.out.print("\nAluno  " + i + " = ");
            for (int j = 0; j < notasAlunos2[i].length; j++){
                System.out.print(notasAlunos2[i][j] + " ");
            }
        }
        
    }
}
