package com.rodrigoleite.fundamentosjava.aula34.labs.questao01;

public class TesteContador {

    public static void main(String[] args){

        imprimirContador();

        Contador.incrementar();

        imprimirContador();

        Contador.zerar();
        
        imprimirContador();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirContador();
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirContador();
    }

    static void imprimirContador(){
        System.out.println(Contador.getContador());
    }
}
