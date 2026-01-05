package com.rodrigoleite.fundamentosjava.labs.listaexercicio03;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int populacaoPaisA;
        double percentualPaisA;
        int populacaoPaisB;
        double percentualPaisB;
        boolean infoValida = false;
        int cont = 0;

        do{
            infoValida = false;
            System.out.println("Entre com a populacao do país A: ");
            populacaoPaisA = scan.nextInt();

            if (populacaoPaisA <= 0){
                System.out.println("Entrada inválida! A população deve ser maior que 0");
            } else {
                infoValida = true;
            }
        } while (infoValida == false);

        do {
            infoValida = false;
            System.out.println("Entre com o percentual de crescimento do país A:");
            percentualPaisA = scan.nextDouble();

            if (percentualPaisA <= 0){
                System.out.println("Entrada inválida! O percentual deve ser maior que 0.");
            } else {
                infoValida = true;
            }
        } while (infoValida == false);

        do{
            infoValida = false;
            System.out.println("Entre com a populacao do país B: ");
            populacaoPaisB = scan.nextInt();

            if (populacaoPaisB <= 0){
                System.out.println("Entrada inválida! A população deve ser maior que 0");
            } else {
                infoValida = true;
            }
        } while (infoValida == false);

        do {
            infoValida = false;
            System.out.println("Entre com o percentual de crescimento do país B:");
            percentualPaisB = scan.nextDouble();

            if (percentualPaisB <= 0){
                System.out.println("Entrada inválida! O percentual deve ser maior que 0.");
            } else {
                infoValida = true;
            }
        } while (infoValida == false);

        scan.close();

        while(populacaoPaisA < populacaoPaisB){
            populacaoPaisA += (populacaoPaisA / 100) * percentualPaisA;
            populacaoPaisB += (populacaoPaisB / 100) * percentualPaisB;
            cont++;
        }

        System.out.println("População País A: " + populacaoPaisA);
        System.out.println("População País B: " + populacaoPaisB);
        System.out.println("A população do pais A, levará " + cont + " anos para se igualar ou ultrapassar a população do país B.");
    }
}
