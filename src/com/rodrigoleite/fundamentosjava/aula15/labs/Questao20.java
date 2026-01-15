package com.rodrigoleite.fundamentosjava.aula15.labs;

import java.util.Scanner;

public class Questao20 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE QUALIFICA O NÍVEL DE PARTICIPAÇÃO EM UM CRIME.\n");

        System.out.println("Faremos algumas perguntas sobre o incidênte(utilize s para sim, e n para não):\n");

        System.out.println("Telefonou para a vítima?");
        String resposta1 = scan.next();
        
        System.out.println("Esteve no local do crime?");
        String resposta2 = scan.next();

        System.out.println("Mora perto da vítima?");
        String resposta3 = scan.next();

        System.out.println("Devia para a vítima?");
        String resposta4 = scan.next();

        System.out.println("Já trabalhou com a vítima?");
        String resposta5 = scan.next();
        scan.close();

        int cont = 0;
        String classificacao = "";
        
        if (resposta1.equalsIgnoreCase("s")){
            cont++;
        }
        if (resposta2.equalsIgnoreCase("s")){
            cont++;
        }
        if (resposta3.equalsIgnoreCase("s")){
            cont++;
        }
        if (resposta4.equalsIgnoreCase("s")){
            cont++;
        }
        if (resposta5.equalsIgnoreCase("s")){
            cont++;
        }

        if (cont == 2){
            classificacao += "Suspeito";
        } else if (cont == 3 || cont == 4){
            classificacao += "Cúmplice";
        } else if (cont == 5){
            classificacao += "Assassino";
        } else {
            classificacao += "Inocente";
        }

        System.out.println("Classificação: " + classificacao);
    }
}
