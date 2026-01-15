package com.rodrigoleite.fundamentosjava.aula15.labs;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGAMA QUE VERIFICA O SEXO DE UMA PESSOA.\n");

        System.out.println("Infome o código de gênero(F ou M):");
        String genero = scan.next();
        scan.close();

        if (genero.equalsIgnoreCase("f")){
            System.out.println("Feminino!");
        } else if (genero.equalsIgnoreCase("m")){
            System.out.println("Masculino!");
        } else {
            System.out.println("Sexo Inválido!");
        }


    }
}
