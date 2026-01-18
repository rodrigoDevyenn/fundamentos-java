package com.rodrigoleite.fundamentosjava.aula43.labs.questao02;

public class ReceitaFederal {

    private Contribuinte[] contribuintes;


    public Contribuinte[] getContribuintes() {
        return contribuintes;
    }

    public void setContribuintes(Contribuinte[] contribuintes) {
        this.contribuintes = contribuintes;
    }

    public String toString() {
        String string = "Receita Federal - Contribuintes:\n\n";
        for (Contribuinte contribuinte : this.contribuintes){
            string += contribuinte;
        }
        return string;
    }
       
}
