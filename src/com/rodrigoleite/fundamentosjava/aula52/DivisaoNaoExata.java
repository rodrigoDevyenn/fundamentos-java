package com.rodrigoleite.fundamentosjava.aula52;

public class DivisaoNaoExata extends Exception{

    private int num;
    private int dem;

    public DivisaoNaoExata(int num, int dem) {
        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "Resultado da divisão de " + num +  " / " + dem + " não é um inteiro!";
    }

    

    
}
