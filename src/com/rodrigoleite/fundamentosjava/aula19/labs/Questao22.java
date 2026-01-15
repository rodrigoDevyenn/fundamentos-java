package com.rodrigoleite.fundamentosjava.aula19.labs;

public class Questao22 {

    public static void main(String[] args) {
        
        int[] arrayA = new int[10];
        int qtdZero = 0;
        int qtdUm = 0;
        double percentualZero;
        double percentualUm;

        for (int i = 0; i < arrayA.length; i++){
            arrayA[i] = (int) Math.round(Math.random() * 1);
            if (arrayA[i] == 0){
                qtdZero++;
            } else {
                qtdUm++;
            }
        }
        percentualUm =  (qtdUm * 100) / arrayA.length;
        percentualZero =  (qtdZero * 100) / arrayA.length;

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("\nPercentual de 0: " + percentualZero + "%.");
        System.out.println("Percentual de 1: " + percentualUm + "%.");
    }
}
