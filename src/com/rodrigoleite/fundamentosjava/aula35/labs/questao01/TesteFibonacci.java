package com.rodrigoleite.fundamentosjava.aula35.labs.questao01;

public class TesteFibonacci {

    public static void main(String[] args){
        for (int i = 0; i <= 20; i++){
            System.out.print((Fibonacci.fibonaccci(i) + " "));
        }
        System.out.println("\n" + Fibonacci.fibonaccci(8));
        

    }
}
