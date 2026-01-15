package com.rodrigoleite.fundamentosjava.aula33.labs.questao04;

public class JogoDaVelha {

    private char[][] tabuleiro;
    private char sinal;
    private String jogadorX;
    private String jogadorO;
    private int jogada;
    private boolean vitoria;
    private boolean fimDeJogo;
    private String vencedor;

    public JogoDaVelha(){
        tabuleiro = new char[3][3];
    }

    public JogoDaVelha(char sinal, String jogadorX, String jogadorO) {
        this.tabuleiro = new char[3][3];
        this.sinal = sinal;
        this.jogadorX = jogadorX;
        this.jogadorO = jogadorO;
        this.jogada = 0;
        this.vitoria = false;
        this.fimDeJogo = false;
        this.vencedor = "";
    }

    public int jogar(int linha, int coluna){
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

    private boolean verificarEntrada(int l, int c){
        if ((l >= 0 && l < 3) && (c >= 0 && c < 3)){
            return true;
        }
        return false;
    }

    private boolean verificarPosicaoDisponivel(int l, int c){
        if (tabuleiro[l][c] == ' ' ){
            return true;
        }
        return false;
    }

    private void trocarSinal(){
        if (sinal == 'X'){
            sinal = 'O';
        } else {
            sinal = 'X';
        }
    }

    private void verificarJogo(){
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
        } else if (jogada > 9){
                    fimDeJogo = true;
                }
    }

    public void reiniciarJogo(){
        jogada = 1;
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

    public void mostrarTabuleiro(){
        for (int i = 0; i < tabuleiro.length; i++){
            for (int j = 0; j < tabuleiro[i].length; j++){
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(char[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public char getSinal() {
        return sinal;
    }

    public void setSinal(char sinal) {
        this.sinal = sinal;
    }

    public String getJogadorX() {
        return jogadorX;
    }

    public void setJogadorX(String jogadorX) {
        this.jogadorX = jogadorX;
    }

    public String getJogadorO() {
        return jogadorO;
    }

    public void setJogadorO(String jogadorO) {
        this.jogadorO = jogadorO;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean isVitoria() {
        return vitoria;
    }

    public void setVitoria(boolean vitoria) {
        this.vitoria = vitoria;
    }

    public boolean isFimDeJogo() {
        return fimDeJogo;
    }

    public void setFimDeJogo(boolean fimDeJogo) {
        this.fimDeJogo = fimDeJogo;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

}
