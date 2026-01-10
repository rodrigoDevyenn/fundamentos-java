package com.rodrigoleite.fundamentosjava.aula18;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int num = scan.nextInt();

        System.out.println("Entre com um limite:");
        int max = scan.nextInt();

        // Digamos que queiramos encontrar o primeiro número que é divisivel por 7 nesse intervalo que definimos, isto é, assim que o for encontrar, ele vai encerrar o loop.
        /* 
        for (int i = num; i <= max; i++){

            System.out.println(i);
            if (i % 7 == 0){
                System.out.println("O valor de i é " + i + ".");
                break;
            }
        }*/

        // Agora digamos que queiramos imprimir o valor de i sempre, mas quando o número for divisivel por 7, queremos pular esse número, isto é, ir para o proximo loop, sem que execute os comandos seguintes desse loop.
        for (int i = num; i <= max; i++){
            if (i % 7 == 0){
                continue;
            }
            System.out.println("O valor de i é " + i + ".");
        }
        scan.close();

    }
    

}
