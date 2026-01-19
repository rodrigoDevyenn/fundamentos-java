package com.rodrigoleite.fundamentosjava.aula47;

public class Excecao {
    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];
            System.out.println("Antes da Exception");

            vetor[4] = 1; // Erro: ArrayIndexOutOfBoundsException
            System.out.println("Essa mensagem não será impressa");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Execeção ao acessar um indice que não existe em um array");
        }

        System.out.println("Essa mensagem será executada após a exception");
        

    }
    
}
