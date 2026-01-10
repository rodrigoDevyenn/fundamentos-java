package com.rodrigoleite.fundamentosjava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scan.nextLine();

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite se tem filhos(true para sim)(false para não): ");
        boolean temFilhos = scan.nextBoolean();

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Nome Completo: " + nome + "\nPrimeiro Nome: " + primeiroNome + "\nIdade: " + idade + "\nAltura: " + altura + "\nTem filhos? " + temFilhos);

        scan.close();

    }
}
