package com.rodrigoleite.fundamentosjava.aula52.labs;

public class Contato {

    static int contador = 0;

    private String nome;
    private String telefone;
    private int id;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.id = contador;
        contador++;
    }

    public String toString(){
        String string = "";
        string += "Contato: " + (this.id + 1);
        string += "\nNome: " + this.nome;
        string += "\nTelefone: " + this.telefone;
        string += "\n";
        return string;    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }


    
}
