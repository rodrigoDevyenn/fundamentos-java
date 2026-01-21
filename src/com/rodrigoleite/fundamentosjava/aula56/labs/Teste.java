package com.rodrigoleite.fundamentosjava.aula56.labs;

public class Teste {

    public static void main(String[] args){

        double x = 10;
        double y = 2;

        for (Operacoes op : Operacoes.values()){
            System.out.println(x + " " + op + " " + y + " = " + op.executarOperacao(x, y));
        }
    }
}
