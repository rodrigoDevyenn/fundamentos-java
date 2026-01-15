package com.rodrigoleite.fundamentosjava.aula27.labs.questao02;

public class ContaCorrente {

    String numero;
    double saldo;
    boolean statusEspecial;
    double limite;
    double limiteDisponível;

    void sacar(double valor){
        if (validarSaque(valor)){
            saldo -= valor;
        } else {
            System.out.println("Saque não efetuado! Saldo insuficiênte.");
        }
    }

    void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        } else {
            System.out.println("Depósito não efetudado! valor inválido.");
        }
    }

    void consultarSaldo(){
        System.out.println("Saldo = " + saldo);
    }

    boolean validarSaque(double valor){
        if (valor > 0 && valor <= saldo){
            return true;
        } else if (statusEspecial){
            if ((valor - saldo) <= limiteDisponível){
                limiteDisponível -= valor;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    boolean usandoCheckEspecial(){
        if (saldo < 0){
            return true;
        } else {
            return false;
        }
    }
}
