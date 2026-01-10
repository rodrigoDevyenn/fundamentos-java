package com.rodrigoleite.fundamentosjava.labs.listaexercicio05;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[][] agenda = new String[31][24];
        int opcao;
        boolean opcaoValida = false;
        boolean agendaAberta = true;
        //opcao 1
        int dia = 0;
        int hora = 0;
        String compromisso = "";

        while (agendaAberta){

            opcaoValida = false;
            do {
                System.out.println("1 - Alterar/Adicionar uma tarefa.\n2 - Consultar.\n0 - Fechar agenda.");
                System.out.println("Escolha um opção: ");
                opcao = scan.nextInt();
                if (opcao == 1){
                    opcaoValida = true;
                } else if (opcao == 2){
                    opcaoValida = true;
                } else if (opcao == 0){
                    opcaoValida = true;
                } else {
                    System.out.println("Opção Inválida! tente novamente.");
                } 
            } while(opcaoValida == false);

            switch (opcao) {
                case 1:

                    System.out.println("Entre com o dia:");
                    dia = scan.nextInt();
                    System.out.println("Entre com a hora:");
                    hora = scan.nextInt();
                    scan.nextLine();
                    System.out.println("O Que gostaria de agendar?");
                    compromisso = "\nCompromisso Marcado: " + scan.nextLine() + "\n";

                    for(int i = 0; i < agenda.length; i++){
                        for (int j = 0; j < agenda[i].length; j++){
                            if (i == (dia - 1) && j == hora){
                                agenda[i][j] = compromisso;
                            }
                        }
                    }
                    break;
                case 2:

                    System.out.println("Entre com o dia:");
                    dia = scan.nextInt();
                    System.out.println("Entre com a hora:");
                    hora = scan.nextInt();

                    for (int i = 0; i < agenda.length; i++){
                        for (int j = 0; j < agenda[i].length; j++){
                            if (i == (dia - 1) && j == hora){
                                System.out.println(agenda[i][j]);
                            }
                        }
                    }
                    break;
                case 0:

                    agendaAberta = false;     
            }
        }
        scan.close();
    }
}
