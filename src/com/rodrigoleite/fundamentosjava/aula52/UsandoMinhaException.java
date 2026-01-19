package com.rodrigoleite.fundamentosjava.aula52;

public class UsandoMinhaException {

    public static void main(String[] args){

        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denomi = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++){
            try {
                if (numeros[i] % 2 != 0){
                    throw new DivisaoNaoExata(numeros[i], denomi[i]);
                }
                System.out.println(numeros[i] + " / " + denomi[i] + " = " + numeros[i] / denomi[i]);
            } 
            catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e){
                System.out.println("Erro!");
                e.printStackTrace();
            }
            
            
        }
    }
}
