package com.rodrigoleite.fundamentosjava.aula43;

public class Teste {

    public static void main(String[] args){

        Aluno aluno = new Aluno();
        aluno.setCurso("Ciencias Da Computação");
        double[] notas = {10, 8.5, 9, 7};
        aluno.setNotas(notas);

        // metodo toString pode fazer a impressão dos atributos dos objetos diretamente.
        System.out.println(aluno);

        //metodo equals
        // verifica se algum objeto é igual e tem a variação para ignorar o case em caso
        // de Strings.
        String s1 = "Java";
        String s2 = "java";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciencias Da Computação");
        double[] notas2 = {10, 8.5, 9, 7};
        aluno2.setNotas(notas2);

        //Está comparando a referência
        System.out.println(aluno == aluno2);

        //Está comparando os atributos.
        System.out.println(aluno.equals(aluno2));

    }
}
