package com.rodrigoleite.fundamentosjava.aula56.labs;

public enum Operacoes {

    SOMA('+') {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRACAO('-') {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MUlTIPLICACAO('*') {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVISAO('/') {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };
    private char valor;

    Operacoes(char valor){
        this.valor = valor;
    }

    public abstract double executarOperacao(double x, double y);

    public String toString(){
        String s = "" + valor;
        return s;
    }

    public char getValor(){
        return valor;
    }
}
