package com.rodrigoleite.fundamentosjava.aula11;

public class VariaveisInteiras{
    
    public static void main(String[] args){

        // byte = 8 bits, short = 16 bits(ambos não são muito utilizados em sistemas reais)
        byte idade01 = 20;
        short idade02 = 21;

        // int = 32 bits, long = 64 bits(ambos são convensões em sistemas reias)
        int idade03 = 22; // (recomendados)
        long idade04 = 23; // ( recomendados)

        System.out.println("Valor da variável idade01: " + idade01);
        System.out.println("Valor da variável idade02: " + idade02);
        System.out.println("Valor da variável idade03: " + idade03);
        System.out.println("Valor da variável idade04: " + idade04);
    }
}