package com.rodrigoleite.fundamentosjava.aula43.labs.questao03;

public class Animal {

    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal(){
        this.patas = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String toString(){
        String string = "Animal: " + this.nome;
        string += "\nComprimento: " + this.comprimento + " cm";
        string += "\nPatas: " + this.patas;
        string += "\nCor: " + this.cor;
        string += "\nAmbiente: " + this.ambiente;
        string += "\nVelocidade: " + this.velocidade + " m/s";
        return string; 
    }
}
