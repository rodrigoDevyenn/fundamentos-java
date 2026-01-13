package com.rodrigoleite.fundamentosjava.labs.listaexercicio07;

public class Lampada {

    String tipo;
    String marca;
    String corLuz;
    String tensao;
    double potencia;
    int vidaUtil;
    boolean ligado;

    void ligar(){
        ligado = true;
    }

    void desligar(){
        ligado = false;
    }
}
