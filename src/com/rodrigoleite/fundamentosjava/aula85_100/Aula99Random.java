package com.rodrigoleite.fundamentosjava.aula85_100;

import java.util.Random;

public class Aula99Random {

    public static void main(String[] args) {
        
        System.out.println(Math.floor(Math.random() * 10));

        Random aleatorio = new Random();

        System.out.println(aleatorio.nextInt());
        System.out.println(aleatorio.nextInt(100)); // excludente
        System.out.println(aleatorio.nextInt(101)); // Para incluir o 100
        System.out.println(aleatorio.nextInt(6)); // Até 5
    }
}
