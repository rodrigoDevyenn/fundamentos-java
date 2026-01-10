package com.rodrigoleite.fundamentosjava.labs.listaexercicio05;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean fimDeJogo = false;
        char[][] tabuleiro = new char[3][3];
        int contJogada = 1;
        char sinal;
        int linha;
        int coluna;
        boolean linhaValida = false;
        boolean colunaValida = false;

        //Preenchendo o tabuleiro com espaço em branco
        for (int i = 0; i < tabuleiro.length; i++){
                for (int j = 0; j < tabuleiro[i].length; j++){
                    tabuleiro[i][j] = ' ';
                } 
            }

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        while (fimDeJogo == false){

            if (contJogada % 2 != 0){
                System.out.println("Vez do jogador 1");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2");
                sinal = 'O';
            }

            linhaValida = false;
            do {
                System.out.println("Entre com a linha(1, 2 ou 3):");
                linha = scan.nextInt();
                if (linha > 0 && linha <= 3){
                    linhaValida = true;
                }
            } while (linhaValida == false);

            colunaValida = false;
            do {
                System.out.println("Entre com a coluna(1, 2 ou 3):");
                coluna = scan.nextInt();
                if (coluna > 0 && coluna <= 3){
                    colunaValida = true;
                }
            } while (colunaValida == false);

            linha--;
            coluna--;

            if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O'){
                System.out.println("Posição do tabuleiro já foi escolhida! tente novamente.");
            } else {
                tabuleiro[linha][coluna] = sinal;
                contJogada++;
            }
            
            //Mostrando o tabuleiro
            for (int i = 0; i < tabuleiro.length; i++){
                for (int j = 0; j < tabuleiro[i].length; j++){
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println();
            }

            //Verificação de Vitoria.
            if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') ||
                (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') ||
                (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') ||
                (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') ||
                (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') ||
                (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') ||
                (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') ||
                (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')){
                    fimDeJogo = true;
                    System.out.println("Parabêns! Jogador 1 ganhou.");
                } else if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') ||
                (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') ||
                (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') ||
                (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') ||
                (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') ||
                (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') ||
                (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') ||
                (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) {
                    fimDeJogo = true;
                    System.out.println("Parabêns! Jogador 2 ganhou.");
                } else if (contJogada > 9){
                    fimDeJogo = true;
                    System.out.println("Ninguém ganhou essa partida.");
                }
        }
        scan.close();
    }
}
