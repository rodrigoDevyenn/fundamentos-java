package com.rodrigoleite.fundamentosjava.aula17.labs;

public class Questao04 {

    public static void main(String[] args) {
        
        int populacaoPaisA = 80000;
        int percentualPaisA = 3;
        int populacaoPaisB = 200000;
        double percentualPaisB = 1.5;
        int cont = 0;

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
