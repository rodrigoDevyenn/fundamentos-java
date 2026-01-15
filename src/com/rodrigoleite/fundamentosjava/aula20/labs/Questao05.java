package com.rodrigoleite.fundamentosjava.aula20.labs;

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[][][] agenda = new String[12][31][8];
        int opcao;
        //Validações
        boolean opcaoValida = false;
        boolean agendaAberta = true;
        boolean diaValido = false;
        boolean horaValida = false;
        boolean mesValido = false;
        //opcao 1 e 2
        int mes = 0;
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

                    do{
                        mesValido = false;
                        System.out.println("Entre com o mês:");
                        mes = scan.nextInt();
                        if (mes > 0 && mes <= 12){
                            mesValido = true;
                        } else { 
                            System.out.println("Mês inválido! Tente novamente.");
                        }
                    } while (mesValido == false);

                    do{
                        diaValido = false;
                        System.out.println("Entre com o dia:");
                        dia = scan.nextInt();
                        if (dia > 0 && dia <= 31){
                            diaValido = true;
                        } else { 
                            System.out.println("Dia inválido! Tente novamente.");
                        }
                    } while (diaValido == false);

                    do{
                        horaValida = false;
                        System.out.println("Entre com a hora:");
                        hora = scan.nextInt();
                        if (hora > 0 && hora <= 8){
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida! Tente novamente.");
                        }
                    } while (horaValida == false);

                    scan.nextLine();
                    System.out.println("O Que gostaria de agendar?");
                    compromisso = "\nCompromisso Marcado: " + scan.nextLine() + "\n";
                    
                    mes--;
                    dia--;
                    hora--;
                    agenda[mes][dia][hora] = compromisso;
                    
                } else if (opcao == 2){

                    opcaoValida = true;

                    do{
                        mesValido = false;
                        System.out.println("Entre com o mês:");
                        mes = scan.nextInt();
                        if (mes > 0 && mes <= 12){
                            mesValido = true;
                        } else { 
                            System.out.println("Mês inválido! Tente novamente.");
                        }
                    } while (mesValido == false);

                    do{
                        diaValido = false;
                        System.out.println("Entre com o dia:");
                        dia = scan.nextInt();
                        if (dia > 0 && dia <= 31){
                            diaValido = true;
                        } else { 
                            System.out.println("Dia inválido! Tente novamente.");
                        }
                    } while (diaValido == false);

                    do{
                        horaValida = false;
                        System.out.println("Entre com a hora:");
                        hora = scan.nextInt();
                        if (hora > 0 && hora <= 8){
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida! Tente novamente.");
                        }
                    } while (horaValida == false);

                    mes--;
                    dia--;
                    hora--;
                    System.out.println(agenda[mes][dia][hora]);
                    

                } else if (opcao == 0){

                    opcaoValida = true;
                    agendaAberta = false;

                } else {

                    System.out.println("Opção Inválida! tente novamente.");

                } 
            } while(opcaoValida == false);
        }
        scan.close();
    }
}
