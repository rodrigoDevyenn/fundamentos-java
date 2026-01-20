package com.rodrigoleite.fundamentosjava.aula52.labs;

public class AgendaCheiaException extends Exception{

    @Override
    public String getMessage() {
        return "A agenda está cheia!";
    }
}
