package com.rodrigoleite.fundamentosjava.aula67;

public class Teste {

    public static void main(String[] args) {
        
        MinhaThread thread = new MinhaThread("Thread #1", 600);
        MinhaThread thread2 = new MinhaThread("Thread #2", 1200);
        MinhaThread thread3 = new MinhaThread("Thread #3", 500);
    }
}
