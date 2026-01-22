package com.rodrigoleite.fundamentosjava.aula68;

public class Teste {

    public static void main(String[] args) {
        
        MinhaThreadRunnable t1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable t2 = new MinhaThreadRunnable("#2", 700);
        MinhaThreadRunnable t3 = new MinhaThreadRunnable("#3", 900);
    }
}
