package com.rodrigoleite.fundamentosjava.aula17.labs;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String usuario = "";
        String senha = "";
        boolean infoValida = false;

        do {
            System.out.println("Entre com o seu usuário:");
            usuario = scan.next();

            System.out.println("Entre com a sua senha:");
            senha = scan.next();

            if (senha.equalsIgnoreCase(usuario)){
                System.out.println("Senha e usuário iguais! Por favor, tente novamente.");
            } else {
                infoValida = true;
                System.out.println("Cadastro realizado com sucesso!");
            }
        } while (infoValida == false);

        scan.close();
    }
}
