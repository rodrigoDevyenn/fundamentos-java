package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao19 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.#");
        double[] notasB1 = new double[10];
        double[] notasB2 = new double[notasB1.length];
        double[] medias = new double[notasB1.length];
        String[] resultados = new String[notasB1.length];

        for (int i = 0; i < notasB1.length; i++){
            System.out.println("Entre com a 1° nota do " + (i + 1) + "° aluno:");
            notasB1[i] = scan.nextDouble();
            System.out.println("Entre com a 2° nota do " + (i + 1) + "° aluno:");
            notasB2[i] = scan.nextDouble();
            medias[i] = (notasB1[i] + notasB2[i]) / 2;
            if (medias[i] < 7){
                resultados[i] = "Reprovado";
            } else {
                resultados[i] = "Aprovado";
            }
        }
        scan.close();

        System.out.println("Resultado:\n");
        for (int i = 0; i < medias.length; i++){
            System.out.println((i + 1) + " - Nota 1°B: " + df.format(notasB1[i]) + ", Nota 2°B: " + df.format(notasB2[i]) + ", Média: " + df.format(medias[i]) + " Resultado: " + resultados[i]);
        }
    }
}
