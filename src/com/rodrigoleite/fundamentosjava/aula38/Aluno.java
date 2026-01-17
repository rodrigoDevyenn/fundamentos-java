package com.rodrigoleite.fundamentosjava.aula38;

public class Aluno extends Pessoa{

    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String curso) {
        super(nome, endereco, telefone, cpf); // Está herdando o método construtor de Pessoa.
        this.curso = curso;
    }

    public void verificarAcessibilidade(){
        // o modificador de acesso protected, permite acesso as subclasses
        this.nomeVisibilidade = "Maria"; // Tem acesso;
        super.nomeVisibilidade = "João"; // Tem acesso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    
}
