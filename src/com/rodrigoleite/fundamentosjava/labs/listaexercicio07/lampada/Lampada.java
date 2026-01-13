package com.rodrigoleite.fundamentosjava.labs.listaexercicio07.lampada;

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

    void mostrarEstado(){
        if (ligado){
            System.out.println("A lâmpada está ligada!");
        } else {
            System.out.println("A lâmpada está desligada!");
        }
    }

    void mudarEstado(){
        if (ligado){
            desligar();
        } else {
            ligar();
        }
    }


}
