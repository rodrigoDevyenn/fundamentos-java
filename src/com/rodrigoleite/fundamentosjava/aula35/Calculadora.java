package com.rodrigoleite.fundamentosjava.aula35;

public class Calculadora {

    // O que é o fatorial?
    // n! = n * (n-1)... n vezes
    // ex: 5! = 5 * 4 * 3 * 2 * 1 = 120 


    public static int fatorialNaoRecursivo(int n){
        if (n == 0){
            return 1;
        }

        int fatorial = 1;
        for (int i = n; i > 1; i--){
            fatorial *= i;
        }
        return fatorial;
    }

    // fatorial de 5 = 5 * fatorial(4);
    // fatorial de 4 = 4 * fatorial(3);
    // fatorial de 3 = 3 * fatorial(2);
    // fatorial de 2 = 2 * fatorial(1);
    // fatorial de 1 = 1 * fatorial(0)
    // fatorial de 0 = 1;

    public static int fatorialRecursivo(int n){
        if (n == 0){
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }
}
