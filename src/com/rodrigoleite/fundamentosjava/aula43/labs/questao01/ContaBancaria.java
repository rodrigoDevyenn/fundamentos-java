package com.rodrigoleite.fundamentosjava.aula43.labs.questao01;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {}

    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    
    //getters and setters

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        String string = "Número da Conta: " + this.numConta + "\nProprietário da Conta: " + this.nomeCliente + "\nSaldo = R$ " + this.saldo + ".\n"; 
        return string;
    }

    
}
