package com.rodrigoleite.fundamentosjava.aula17;

public class LoopFor {

    public static void main(String[] args) {
        
        //Bloco for normal
        for (int i = 0; i < 5; i++){
            System.out.println("i tem o valor de " + i);
        }

        System.out.print("\n");

        //Bloco for normal com decrementação
        for (int i = 5; i > 0; i--){
            System.out.println("i tem o valor de " + i);
        }

        System.out.print("\n");

        //Bloco for com duas variáveis.
        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }
    }
}
