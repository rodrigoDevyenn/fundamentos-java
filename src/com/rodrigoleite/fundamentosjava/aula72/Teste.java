package com.rodrigoleite.fundamentosjava.aula72;

public class Teste {

    public static void main(String[] args) {
        
        TicTac tt = new TicTac();
        ThreadTicTac tic = new ThreadTicTac("Tic", tt);
        ThreadTicTac tac = new ThreadTicTac("Tac", tt);

    }
}
