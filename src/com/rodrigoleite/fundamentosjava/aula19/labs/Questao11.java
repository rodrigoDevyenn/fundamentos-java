package com.rodrigoleite.fundamentosjava.aula19.labs;

import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int cont = 0;
        String registro = "Números Pares Presentes No Array:\n\n";

        for (int i = 0; i < array.length; i++){

            System.out.println("Entre com o valor da posição " + i + ":");
            array[i] = scan.nextInt();
            if (array[i] % 2 == 0){
                cont++;
                registro += "Indice: " + i + " - Valor: " + array[i] + "\n";
            }  
        }
        scan.close();
        
        System.out.println(registro);
        System.out.println("Quantidade de números pares é de " + cont + ".");
    }
}
