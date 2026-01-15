package com.rodrigoleite.fundamentosjava.aula33.labs.questao01;

public class TesteLampada {

    public static void main(String[] args){

        Lampada lampada = new Lampada();

        lampada.setMarca("consul");
        lampada.setTipo("LED");
        lampada.setCorLuz("Amarelo");
        lampada.setTensao("Bivolt");
        lampada.setPotencia(12);
        lampada.setLigado(false);

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
