package com.rodrigoleite.fundamentosjava.aula36.labs.questao02;

public class Curso {

    private String nomeCurso;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;
    private int quantidadeAlunos;
    private String[] registros;
    private double somaMedias;

    public Curso(){
        this.quantidadeAlunos = 0;
        this.somaMedias = 0;
        this.alunos = new Aluno[quantidadeAlunos];
        this.registros = new String[quantidadeAlunos];
    }

    public double mostarMediaTurma(){
        return getSomaMedias() / getQuantidadeAlunos();
    }

    public String mostrarTurma(){
        String infoTurma = "Registro Do Curso " + getNomeCurso() + ", Horario: " + getHorario() + "\n\nProfessor " + getProfessor().getNome() + ", Departamento: " + getProfessor().getDepartamento() + "\nE-mail: " + getProfessor().getEmail() + "\n\n";
        for (String registro : getRegistros()){
            infoTurma += registro;
        }
        return infoTurma;
    }

    public void cadastrarAluno(Aluno aluno){
        redimensionarArrayAlunos();
        redimensionarArrayRegistros();
        adicionarAluno(aluno);
        adicionarRegistroAluno(aluno);
        this.quantidadeAlunos++;    
    }

    private void adicionarAluno(Aluno aluno){
        getAlunos()[quantidadeAlunos] = aluno;
    }

    private String adicionarRegistroAluno(Aluno aluno){
        String registro = "Aluno: " + aluno.getNome() + ".\nMatricula: " + aluno.getMatricula() + ".\nNotas: " + aluno.getNotas()[0] + ", " + aluno.getNotas()[1] + ", " + aluno.getNotas()[2] + ", " + aluno.getNotas()[3] + ".\nMedia: " + calcularMedia(aluno) + ".\nResultado: " + verificarResultado(aluno) + ".\n\n" ;
        getRegistros()[quantidadeAlunos] = registro;
        return registro;
    }

    private double calcularMedia(Aluno aluno){
        double soma = 0;
        for (double nota : aluno.getNotas()){
            soma += nota;
        }
        double media = soma / 4;
        this.somaMedias += media;
        return media;

    }

    private String verificarResultado(Aluno aluno){
        if (calcularMedia(aluno) >= 7 ){
            return "Aprovado";
        }
        return "Reprovado";
    }

    private void redimensionarArrayAlunos(){
        Aluno[] alunos = new Aluno[quantidadeAlunos + 1];
        for (int i = 0; i < (quantidadeAlunos); i++){
            alunos[i] = this.alunos[i];
        }
        setAlunos(alunos);
    }

    private void redimensionarArrayRegistros(){
        String[] registros = new String[quantidadeAlunos + 1];
        for (int i = 0; i < (quantidadeAlunos); i++){
            registros[i] = this.registros[i];
        }
        setRegistros(registros);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String[] getRegistros() {
        return registros;
    }

    public void setRegistros(String[] registros) {
        this.registros = registros;
    }

    public double getSomaMedias() {
        return somaMedias;
    }

    public void setSomaMedias(double somaMedias) {
        this.somaMedias = somaMedias;
    }
    
    

    



}
