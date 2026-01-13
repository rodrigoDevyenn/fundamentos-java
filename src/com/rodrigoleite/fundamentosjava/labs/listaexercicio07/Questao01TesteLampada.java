package com.rodrigoleite.fundamentosjava.labs.listaexercicio07;

public class Questao01TesteLampada {

    public static void main(String[] args){

        Lampada lampada = new Lampada();

        lampada.marca = "consul";
        lampada.tipo = "LED";
        lampada.corLuz = "Amarelo";
        lampada.tensao = "Bivolt";
        lampada.potencia = 12;
        lampada.ligado = false;

        lampada.ligar();
        System.out.println("A lâmpada está ligada: " + lampada.ligado);

        lampada.desligar();
        System.out.println("A lâmpada está ligada: " + lampada.ligado);
    }
}
