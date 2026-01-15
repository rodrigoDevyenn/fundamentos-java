package com.rodrigoleite.fundamentosjava.labs.listaexercicio07.questao04;

public class JogoDaVelha {

    char[][] tabuleiro = new char[3][3];
    char sinal;
    String jogadorX;
    String jogadorO;
    int jogada;
    boolean vitoria;
    boolean fimDeJogo;
    String vencedor;


    int jogar(int linha, int coluna){
        int l = --linha;
        int c = --coluna;
        if (verificarEntrada(l, c)){
            if (verificarPosicaoDisponivel(l, c)){
                tabuleiro[l][c] = sinal;
                jogada++;
                trocarSinal();
                verificarJogo();
                return 1;
            }
            return -1;
        }
        return -2;
    }

    boolean verificarEntrada(int l, int c){
        if ((l >= 0 && l < 3) && (c >= 0 && c < 3)){
            return true;
        }
        return false;
    }

    boolean verificarPosicaoDisponivel(int l, int c){
        if (tabuleiro[l][c] == ' ' ){
            return true;
        }
        return false;
    }

    void trocarSinal(){
        if (sinal == 'X'){
            sinal = 'O';
        } else {
            sinal = 'X';
        }
    }

    void verificarJogo(){
        if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') ||
            (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') ||
            (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') ||
            (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') ||
            (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') ||
            (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') ||
            (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') ||
            (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')){
                vitoria = true;
                vencedor = jogadorX;
        } else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') ||
            (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') ||
            (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') ||
            (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') ||
            (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') ||
            (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') ||
            (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') ||
            (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) {
                vitoria = true;
                vencedor = jogadorO;
        } else if (jogada >= 9){
                    fimDeJogo = true;
                }
    }

    void reiniciarJogo(){
        jogada = 0;
        vitoria = false;
        fimDeJogo = false;
        sinal = ' ';
        vencedor = "";

        for (int i = 0; i < tabuleiro.length; i++){
            for (int j = 0; j < tabuleiro[i].length; j++){
                tabuleiro[i][j] = ' ';
            }
        }
    }

}
