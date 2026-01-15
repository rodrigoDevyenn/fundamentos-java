package com.rodrigoleite.fundamentosjava.aula33.labs.questao03;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno(){
        disciplinas = new String[3];
        notas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new double[3][4];
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        
        for (int i = 0; i < notas.length; i++){
            System.out.print(disciplinas[i] + " = ");
            for (int j = 0; j < notas[i].length; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String verificaAprovado(int indice ){
        double media = calcularMedia(indice);
        if (media >= 7){
            return "Aprovado";
        } 
        return "Reprovado";
    }

    private double calcularMedia(int indice){
        double soma = 0;
        double media;
        for (int i = 0; i < notas[indice].length; i++){
            soma += notas[indice][i];
        }
        media = soma / 4;
        return media;
    }

    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.disciplinas[pos] = nomeDisciplina;
    }

    public void setNotasPos(int posI, int posJ, double nota){
        this.notas[posI][posJ] = nota;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return this.notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    
}
