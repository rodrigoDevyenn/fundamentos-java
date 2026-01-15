package com.rodrigoleite.fundamentosjava.labs.listaexercicio07.questao01;

public class TesteLampada {

    public static void main(String[] args){

        Lampada lampada = new Lampada();

        lampada.marca = "consul";
        lampada.tipo = "LED";
        lampada.corLuz = "Amarelo";
        lampada.tensao = "Bivolt";
        lampada.potencia = 12;
        lampada.ligado = false;

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
