package com.rodrigoleite.fundamentosjava.aula17.labs;

public class Questao16 {

    public static void main(String[] args) {
        
        int primeiro = 0;
        int segundo = 1;
        int proximo;
        boolean flag = false;

        System.out.print(primeiro + " ");
        System.out.print(segundo + " ");

        do{
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.print(proximo + " ");
            
            if (proximo > 500){
                flag = true;
            }
        } while (flag == false);
    }
}
