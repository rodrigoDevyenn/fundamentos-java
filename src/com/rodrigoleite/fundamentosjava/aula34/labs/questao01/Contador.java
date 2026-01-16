package com.rodrigoleite.fundamentosjava.aula34.labs.questao01;

public class Contador {

    private static int contador;

    public Contador(){
        contador++;
    }

    public static void zerar(){
        contador = 0;
    }

    public static void incrementar(){
        contador++;
    }

    public static int getContador(){
        return contador;
    }

    public static void setContador(int valor){
        contador = valor;
    }





    
}
