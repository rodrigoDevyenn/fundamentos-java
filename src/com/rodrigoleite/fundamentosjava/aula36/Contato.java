package com.rodrigoleite.fundamentosjava.aula36;

public class Contato {

    private String nome;
    private Telefone[] telefones;
    private Endereco endereco;

    public Contato(){

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
}
