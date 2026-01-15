package com.rodrigoleite.fundamentosjava.labs.listaexercicio07.questao04;

import java.util.Random;
import java.util.Scanner;

public class TesteJogoDaVelha {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        Random numeroAleatorio = new Random();
        int numeroJogadorX = 0;
        int numeroJogadorO = 0;
        int linha;
        int coluna;
        int jogadaValida;
        boolean sairMenu = false;
        int opcaoMenu;

        while (sairMenu == false){
            System.out.println("Menu:\n1 - Começar um novo jogo.\n2 - Sair.");
            opcaoMenu = scan.nextInt();
            if (opcaoMenu == 1){

                jogo.reiniciarJogo();

                System.out.println("Bem-Vindos! Vamos Jogar Jogo Da Velha?");
                System.out.println("REGRAS DO JOGO:\n1 - O jogador que completar primeiro uma fileira de 3 no tabuleiro vence, seja vertical, horizontal ou diagonal.\n2 - Se nenhum jogador completar 3 fileiras até todo o tabuleiro estar preechido, significa que deu velha e o jogo será encerrado sem vencedores.");
                scan.nextLine();

                System.out.println("Entre com o jogador X:");
                jogo.jogadorX = scan.nextLine();
                
                System.out.println("Entre com o jogador O:");
                jogo.jogadorO = scan.nextLine();

                System.out.println("VAMOS DECIDIR QUEM DEVE JOGAR PRIMEIRO!");
                System.out.println("Cada um de vocês terá um número entre 0 a 9 gerado aleatoriamente, quem tiver o número maior começa o jogo.");
                do {
                    numeroJogadorX = numeroAleatorio.nextInt(9);
                    numeroJogadorO = numeroAleatorio.nextInt(9);
                    if (numeroJogadorX > numeroJogadorO){
                        jogo.sinal = 'X';
                        System.out.println(jogo.jogadorX + " Tirou " + numeroJogadorX + ".");
                        System.out.println(jogo.jogadorO + " Tirou " + numeroJogadorO + ".");
                        System.out.println(jogo.jogadorX + " Irá começar!\n");
                        break;
                    } else if (numeroJogadorO > numeroJogadorX){
                        jogo.sinal = 'O';
                        System.out.println(jogo.jogadorX + " Tirou " + numeroJogadorX + ".");
                        System.out.println(jogo.jogadorO + " Tirou " + numeroJogadorO + ".");
                        System.out.println(jogo.jogadorO + " Irá começar!\n");
                        break;
                    } else {
                        continue;
                    }
                } while (true);

                while (!jogo.fimDeJogo && !jogo.vitoria){

                    if (jogo.sinal == 'X'){
                        System.out.println("VEZ DO JOGADOR X: " + jogo.jogadorX);
                    } else {
                        System.out.println("VEZ DO JOGADOR O: " + jogo.jogadorO);
                    }

                    System.out.println("Faça sua jogada:\n");
                    do{
                        System.out.print("Entre com a linha(1, 2 ou 3):");
                        linha = scan.nextInt();

                        System.out.print("Entre com a coluna(1,2 ou 3):");
                        coluna = scan.nextInt();

                        System.out.println();

                        jogadaValida = jogo.jogar(linha, coluna);
                        if (jogadaValida == 1){
                            break;
                        } else if (jogadaValida == -1){
                            System.out.println("Posição não disponível! tente novamente.\n");
                        } else if (jogadaValida == -2) {
                            System.out.println("Posições Inválidas! tente novamente.");
                        }
                    } while (true);

                    for (int i = 0; i < jogo.tabuleiro.length; i++){
                        for (int j = 0; j < jogo.tabuleiro[i].length; j++){
                            System.out.print(jogo.tabuleiro[i][j] + " | ");
                        }
                        System.out.println();
                    }

                    if (jogo.vitoria){
                        System.out.println("\nO Jogador " + jogo.vencedor + " venceu, PARABÊNS!\n");
                    } else if (jogo.fimDeJogo) {
                        System.out.println("\nO JOGO DEU VELHA! que pena, ninguém ganhou!");
                    }
                }

            } else if (opcaoMenu == 2){
                sairMenu = true;
            } else {
                System.out.println("Opcao inválida! tente novamente.");
            }
        }
        scan.close();
    }
}
