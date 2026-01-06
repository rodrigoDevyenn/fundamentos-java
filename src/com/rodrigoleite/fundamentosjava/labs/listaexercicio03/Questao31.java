package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao31 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,###.##");
        int ano = 1996;
        double salario;
        double percentual = 1.5;
        String registro = "REGISTRO DE SALÁRIO\n";


        System.out.println("Entre com o salário inicial:");
        salario = scan.nextDouble();
        scan.close();

        registro += "Ano de contratação: " + 1995 + " - Salário inicial = R$ " + salario + "\n";

        while (ano <= 2026){
            salario += ((salario/100) * percentual);
            registro += "Ano: " + ano + " - Salário = R$ " + format.format(salario) + " (" + percentual + "% de aumento).\n";
            percentual *= 2;
            ano++;
        }
        System.out.println(registro);


    }
}
