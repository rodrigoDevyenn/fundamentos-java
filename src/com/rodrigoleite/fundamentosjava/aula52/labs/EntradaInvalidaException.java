package com.rodrigoleite.fundamentosjava.aula52.labs;

public class EntradaInvalidaException extends Exception{

    public String getMessage() {
        return "Entrada Inválida! Tente novamente.";
    }
}
