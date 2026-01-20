package com.rodrigoleite.fundamentosjava.aula52.labs;

public class ContatoNaoExisteException extends Exception {

    public String getMessage(){
       return "Contato não encontrado!" ; 
    }
}
