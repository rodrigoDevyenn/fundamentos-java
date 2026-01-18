package com.rodrigoleite.fundamentosjava.aula43.labs.questao02;

public class PessoaFisica extends Contribuinte {

    private String cpf;

    public PessoaFisica(){

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        String string = "Contribuinte: " + super.getNome() + ".\nPessoa Física - CPF: " + this.cpf +  ".\nRenda Bruta: R$ " + super.getRendaBruta() + ".\nIR: R$ " + this.calcularImpostoRenda() + ".\n\n";
        return string;
    }

    public double calcularImpostoRenda(){
        double renda = super.getRendaBruta();
        if (renda <= 1400 ){
            return 0;
        } else if (renda > 1400 && renda <= 2100){
            return (renda * 0.1) - 100 ;
        } else if (renda > 2100 && renda <= 2800){
            return (renda * 0.15) - 270;
        } else if (renda > 2800 && renda <= 3600){
            return (renda * 0.25) - 500;
        } else {
            return (renda * 0.30) - 700;
        }
    }

    
}
