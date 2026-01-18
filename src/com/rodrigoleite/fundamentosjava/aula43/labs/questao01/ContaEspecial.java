package com.rodrigoleite.fundamentosjava.aula43.labs.questao01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(){}

    public boolean sacar(double valor){
        if ((super.getSaldo() + this.limite) >= valor){
            super.setSaldo(super.getSaldo() - valor);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String toString(){
        String string = super.toString() + "Limite Especial = R$ " + this.limite + ".\n";
        return string;
    }

    
}
