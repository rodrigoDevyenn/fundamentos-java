package com.rodrigoleite.fundamentosjava.aula54;

public class TesteEnum {

    public static void main(String[] args){

        DiaSemana dia = DiaSemana.TERCA;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(21, 1, 2026, DiaSemana.TERCA);
        
        System.out.println(data.getDia() + "/" + data.getMes() + "/" + data.getAno() + " - " + data.getDiaSemana());
    }
}
