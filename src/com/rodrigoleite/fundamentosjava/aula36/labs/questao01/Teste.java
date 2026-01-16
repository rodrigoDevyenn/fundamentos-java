package com.rodrigoleite.fundamentosjava.aula36.labs.questao01;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        boolean agendaAberta = true;
        int opcao;
        
        System.out.println("Olá, Seja Bem-vindo(a), vamos criar a sua agenda de contatos!\n");
        
        System.out.println("Dê um nome para sua agenda:");
        String nomeAgenda = scan.nextLine();
        Agenda agenda = new Agenda(nomeAgenda);
        
        while (agendaAberta){
            menu();
            opcao = scan.nextInt();
            scan.nextLine();
            if (opcao == 1){

                System.out.println(agenda.obterAgenda());

            } else if (opcao == 2){
                
                System.out.println("Entre com o nome do contato:");
                String nome = scan.nextLine();
                System.out.println("Entre com o telefone:");
                String telefone = scan.nextLine();
                System.out.println("Entre com o email do contato:");
                String email = scan.next();
                agenda.adicionarContato(nome, telefone, email);

            } else if (opcao == 3){

                System.out.println("Entre com o indice:");
                int indice = scan.nextInt();
                scan.nextLine();
                System.out.println(agenda.obterContato(indice));

            } else if (opcao == 4){

                agendaAberta = false;

            } else {
                System.out.println("Opcão Inválida! Tente novamente.");
            }
        }
        scan.close();
        
    }

    static void menu(){
        System.out.println("\nO que deseja fazer?\n1 - Imprimir Contatos.\n2 - Adicionar Novo Contato.\n3 - Mostrar Contato Pelo Indice.\n4 - Sair");
    }
}
