package com.rodrigoleite.fundamentosjava.aula43.labs.questao01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca(){}

    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            double novoSaldo = super.getSaldo() + (super.getSaldo() / 100) * taxaRendimento;
            super.setSaldo(novoSaldo);
            return true;
        }
        return false; 
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public String toString(){
        String string = super.toString() + "Dia de Rendimento: " + this.diaRendimento + ".\n"; 
        return string;
    }
}
