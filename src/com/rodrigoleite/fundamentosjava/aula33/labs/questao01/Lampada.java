package com.rodrigoleite.fundamentosjava.aula33.labs.questao01;

public class Lampada {

    private String tipo;
    private String marca;
    private String corLuz;
    private String tensao;
    private double potencia;
    private int vidaUtil;
    private boolean ligado;

    public Lampada(){}

    public Lampada(String tipo, String marca, String corLuz, String tensao, double potencia, int vidaUtil, boolean ligado) {
        this.tipo = tipo;
        this.marca = marca;
        this.corLuz = corLuz;
        this.tensao = tensao;
        this.potencia = potencia;
        this.vidaUtil = vidaUtil;
        this.ligado = ligado;
    }

    public void ligar(){
        setLigado(true);
    }

    public void desligar(){
        setLigado(false);
    }

    public void mostrarEstado(){
        if (isLigado()){
            System.out.println("A lâmpada está ligada!");
        } else {
            System.out.println("A lâmpada está desligada!");
        }
    }

    public void mudarEstado(){
        if (isLigado()){
            desligar();
        } else {
            ligar();
        }
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    } 

    public String getCorLuz(){
        return this.corLuz;
    }

    public void setCorLuz(String corLuz){
        this.corLuz = corLuz;
    }

    public String getTensao() {
        return this.tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getVidaUtil() {
        return this.vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


}
