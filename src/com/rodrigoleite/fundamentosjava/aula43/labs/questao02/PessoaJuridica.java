package com.rodrigoleite.fundamentosjava.aula43.labs.questao02;

public class PessoaJuridica extends Contribuinte{

    private String cnpj;



    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString(){
        String string = "Contribuinte: " + super.getNome() + ".\nPessoa Juridica - CNPJ: " + this.cnpj +  ".\nRenda Bruta: R$ " + super.getRendaBruta() + ".\nIR R$ " + this.calcularImpostoRenda() + ".\n\n";
        return string;
    }

    public double calcularImpostoRenda(){
        return (super.getRendaBruta() / 100) * 10;
    }


}
