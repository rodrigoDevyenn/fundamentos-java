package com.rodrigoleite.fundamentosjava.labs.listaexercicio01;

import java.util.Scanner;

public class Questao18 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA O TEMPO APROXIMADO DE DOWNLOAD DE AQUIVOS.\n");

        System.out.println("Insira o tamanho do arquivo em Mb:");
        double tamanhoArquivo = scan.nextDouble();
        System.out.println("Insira a velocidade em Mbps:");
        double velocidade = scan.nextDouble();
        scan.close();

        System.out.println("O tempo aproximado é de " + (tamanhoArquivo / velocidade) + "s.");

    }
}
