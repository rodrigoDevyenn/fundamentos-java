package com.rodrigoleite.fundamentosjava.aula56;

public class Teste {

    public static void main(String[] args){

        /*for (TipoDocumento doc : TipoDocumento.values()){
            System.out.println(doc + " - " + doc.geraNumeroTeste());
        }*/

        Pessoa pessoaFisica = new Pessoa();
        pessoaFisica.setTipoDocumento(TipoDocumento.valueOf(TipoDocumento.class, "CPF"));
        pessoaFisica.setNumDocumento(pessoaFisica.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoaFisica);

        Pessoa pessoaJuridica = new Pessoa();
        pessoaJuridica.setTipoDocumento(TipoDocumento.valueOf(TipoDocumento.class, "CNPJ"));
        pessoaJuridica.setNumDocumento(pessoaJuridica.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoaJuridica);
    }
}
