package com.rodrigoleite.fundamentosjava.aula33.labs.questao02;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean statusEspecial;
    private double limite;
    private double limiteDisponível;

    public ContaCorrente(){}

    public ContaCorrente(String numero, double saldo, boolean statusEspecial, double limite){
        this.numero = numero;
        this.saldo = saldo;
        this.statusEspecial = statusEspecial;
        this.limite = limite;
        this.limiteDisponível = limite;
    }

    public void sacar(double valor){
        if (validarSaque(valor)){
            saldo -= valor;
        } else {
            System.out.println("Saque não efetuado! Saldo insuficiênte.");
        }
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        } else {
            System.out.println("Depósito não efetudado! valor inválido.");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo = " + saldo);
    }

    private boolean validarSaque(double valor){
        if (valor > 0 && valor <= saldo){
            return true;
        } else if (isStatusEspecial()){
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

    public boolean usandoCheckEspecial(){
        if (saldo < 0){
            return true;
        } else {
            return false;
        }
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatusEspecial() {
        return this.statusEspecial;
    }

    public void setStatusEspecial(boolean statusEspecial) {
        this.statusEspecial = statusEspecial;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimiteDisponível() {
        return this.limiteDisponível;
    }

    public void setLimiteDisponível(double limiteDisponível) {
        this.limiteDisponível = limiteDisponível;
    }
}
