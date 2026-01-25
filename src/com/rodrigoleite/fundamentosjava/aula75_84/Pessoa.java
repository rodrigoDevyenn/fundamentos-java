package com.rodrigoleite.fundamentosjava.aula75_84;

public class Pessoa {

    private String codigo;
    private String nome;
    private int idade;

    public Pessoa(){

    }

    public Pessoa(String codigo, String nome, int idade){
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Codigo: " + this.codigo + ", Nome: " + this.nome + ", Idade: " + this.idade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
