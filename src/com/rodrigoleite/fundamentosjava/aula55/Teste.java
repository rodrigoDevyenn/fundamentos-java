package com.rodrigoleite.fundamentosjava.aula55;

import com.rodrigoleite.fundamentosjava.aula54.DiaSemana;

public class Teste {

    public static void main(String[] args){

        DiaSemana[] diaSemana = DiaSemana.values();

        for (int i = 0; i < diaSemana.length; i++){
            System.out.println(diaSemana[i]);
        }
    }
}
