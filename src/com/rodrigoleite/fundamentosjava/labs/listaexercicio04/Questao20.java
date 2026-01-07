package com.rodrigoleite.fundamentosjava.labs.listaexercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao20 {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        Scanner scan = new Scanner(System.in);
        double[] valoresDolar = new double[20];
        double cotacaoDolar = 5.39;

        System.out.println("Entre com a cotação do dolar atual:");
        cotacaoDolar = scan.nextDouble();
        scan.close();

        for (int i = 0; i < valoresDolar.length; i++){
            valoresDolar[i] = cotacaoDolar * (i + 1);
        }

        System.out.println("Valores Dolar:");
        for (int i = 0; i < valoresDolar.length; i++){
            System.out.println("$ " + (i + 1) + ".00 = R$ " + df.format(valoresDolar[i]));
        }


    }
}
