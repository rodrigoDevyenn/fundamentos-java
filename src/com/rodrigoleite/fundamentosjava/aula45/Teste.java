package com.rodrigoleite.fundamentosjava.aula45;

public class Teste {

    public static void main(String[] args){
        // Upcasting(converter um tipo de uma classe filha para um tipo de uma classe pai).
        /*Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno;  // upcasting

        Pessoa pessoa = (Pessoa) new Aluno(); //upcasting

        // Downcasting(Converter um tipo de uma classe pai para um tipo de uma classe filha).
        Pessoa pessoa2 = new Pessoa();
        Aluno pessoaAluno2 = (Aluno) pessoa2; //downcasting*/

        Aluno aluno = new Aluno();
        Pessoa pessoa = new Pessoa();
        Professor prof = new Professor();

        if (pessoa instanceof Pessoa){
            System.out.println("A variavel pessoa é da classe Pessoa.");
        }
        if (prof instanceof Professor){
            System.out.println("A variavel prof é da classe Professor.");
        }
        if (aluno instanceof Aluno){
            System.out.println("A variavel aluno é da classe Aluno.");
        }

    }
}
