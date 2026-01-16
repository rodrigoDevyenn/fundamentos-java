package com.rodrigoleite.fundamentosjava.aula35.labs.questao01;

public class Fibonacci {

    public static int fibonaccci(int n){
        if (n < 2){
            return 1;
        }
        return fibonaccci(n - 1) + fibonaccci(n - 2);
    }
}
