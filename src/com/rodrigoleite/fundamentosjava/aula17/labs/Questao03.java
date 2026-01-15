package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        boolean infoValida = false;

        do {
            infoValida = false;
            System.out.println("Entre com um nome:");
            nome = scan.next();

            if (nome.length() <= 3){
                System.out.println("Nome inválido! Precisa ter mais que 3 caracteres.");
            } else {
                infoValida = true;
                System.out.println("Nome cadastrado com sucesso!");
            }
        } while (infoValida == false);

        do {
            infoValida = false;
            System.out.println("Entre com sua idade:");
            idade = scan.nextInt();

            if (idade < 0 || idade > 150){
                System.out.println("Idade inválida! Não será aceito idade negativa ou acima de 150.");
            } else {
                infoValida = true;
                System.out.println("Idade cadastrada com sucesso!");
            }
        } while (infoValida == false);

        do {
            infoValida = false;
            System.out.println("Entre com o seu salário:");
            salario = scan.nextDouble();

            if (salario < 0){
                System.out.println("Salário inválido! Insira valores iguais ou acima de 0");
            } else {
                infoValida = true;
                System.out.println("Salário cadastrado com sucesso!");
            }
        } while (infoValida == false);
        
        do {
            infoValida = false;
            System.out.println("Entre com o sexo(M - Masculino, F - Feminino):");
            sexo = scan.next();

            if (!(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M"))){
                System.out.println("Sexo inválido! Tente novamete!");
            } else {
                infoValida  = true;
                System.out.println("Sexo cadastrado com sucesso!");
            }
        } while (infoValida == false);

        do {
            infoValida = false;
            System.out.println("Entre com o seu estado civil(S - Solteiro, C - Casado, V - Viúvo e D - Divorciado):");
            estadoCivil = scan.next();

            switch (estadoCivil) {
                case "s":
                case "S":
                case "c":
                case "C":
                case "v":
                case "V":
                case "d":
                case "D":
                    infoValida = true;
                    System.out.println("Estado civil cadastrado com sucesso!");
                    break;
                default: System.out.println("Estado civil inválido! Tente novamente.");
            }
        } while (infoValida == false);
        
        scan.close();

        }
}
