package com.rodrigoleite.fundamentosjava.aula11;

public class VariaveisPontoFlutuante {
    public static void main(String[] args) {
        
        //32 bits (menos utilizado em sistemas reais)
        float valorTomate = 3.95f;

        //64 bits (convensão em sistemas reais)
        double valorPassagem = 2.90; // (recomendado)

        System.out.println("Valor do kl de tomate: " + valorTomate);
        System.out.println("Valor da passagem: " + valorPassagem);

        //Em java, tipos de ponto flutuante aceitam notação ciêntifica:
        double num = 123.4;
        double numNc = 1.234e2;
        // São o mesmo valor, só que numNc está em notação ciêntifica.
        System.out.println("Número normal: " + num);
        System.out.println("Número em notação: " + numNc);


    }
}
