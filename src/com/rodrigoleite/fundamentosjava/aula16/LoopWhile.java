package com.rodrigoleite.fundamentosjava.aula16;

public class LoopWhile {

    public static void main(String[] args) {
        
        int i  = 1;
        int max = 10;

        System.out.println("Contando de 1 a 10:");

        // while verifica a condição primeiro e depois executa se for verdadeira.
        while(i <= max){
            System.out.println("O valor de i é " + i);
            i++;
        }
        
        // o do while primeiro executa e depois verifica a condição, isto é, ao menos 1 vez esse bloco será executado.
        do{
            System.out.println("O valor de i é " + i);
            i++;
        } while (i < 15);
    }
}
