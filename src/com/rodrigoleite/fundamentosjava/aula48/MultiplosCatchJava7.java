package com.rodrigoleite.fundamentosjava.aula48;

public class MultiplosCatchJava7 {

    public static void main(String[] args){

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denomi = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++){
            try {System.out.println(numeros[i] + " / " + denomi[i] + " = " + numeros[i] / denomi[i]);
            } 
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Ocorreu um Erro!");
            }
            
        }
    }
}
