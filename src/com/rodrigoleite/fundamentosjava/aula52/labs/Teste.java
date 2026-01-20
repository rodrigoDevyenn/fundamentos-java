package com.rodrigoleite.fundamentosjava.aula52.labs;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); 
        boolean agendaAberta = true;

        String nomeAgenda = lerInfo(scan, "Qual o nome da sua agenda?");
        Agenda agenda = new Agenda(nomeAgenda);
        
        int opcao;

        while(agendaAberta){
            opcao = obterOpcao(scan);
            if (opcao == 1){
                consultarContato(agenda, scan);
            } else if (opcao == 2){
                adicionarContato(agenda, scan);
            } else if ( opcao == 3){
                agendaAberta = false;
            }
        }
    }

    static void adicionarContato(Agenda agenda, Scanner scan){
        String nomeContato = lerInfo(scan, "Informe o nome do contato");
        String telefoneContato = lerInfo(scan, "Informe o telefone do contato:");
        Contato contato = new Contato(nomeContato, telefoneContato);
    
        try {
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
        }
    }

    static void consultarContato(Agenda agenda, Scanner scan){
        String nome = lerInfo(scan, "Informe o nome do contato a ser pesquisado:");
        Contato contato = null;
        try{
            contato = agenda.consultarContato(nome);
            if (contato != null){
                System.out.println(contato);
            }
        } catch (ContatoNaoExisteException e){
            System.out.println(e.getMessage());
        }
    }
    
    static String lerInfo(Scanner scan, String msg){
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    static int obterOpcao(Scanner scan){

        int opcao = 3;
        boolean opcaoValida = false;

        while(opcaoValida == false){
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Consultar Contato");
            System.out.println("2 - Adicionar Contato");
            System.out.println("3 - Sair");

            try{
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3){
                    opcaoValida = true;
                } else {
                    throw new EntradaInvalidaException();
                }
            } catch (EntradaInvalidaException e){
                System.out.println(e.getMessage());
            }
        }
        return opcao;
    }
    
}
