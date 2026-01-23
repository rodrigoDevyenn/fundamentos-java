package com.rodrigoleite.fundamentosjava.aula74.labs;

public enum CorSemafaro {

    VERMELHO(4000), AMARELO(1000), VERDE(2000);

    private int tempoEspera;

    CorSemafaro(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera(){
        return tempoEspera;
    }
}
