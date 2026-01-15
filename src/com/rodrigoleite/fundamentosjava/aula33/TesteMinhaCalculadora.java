package com.rodrigoleite.fundamentosjava.aula33;

public class TesteMinhaCalculadora {

    public static void main(String[] args) {
        
        // Sobrecarga de métodos acontece quando eu tenho vários métodos com o mesmo nome,
        // mas com assinaturas diferentes, ou seja, a quantidade de parâmetros, os tipos de parâmetros e o tipo de retorno diferente.

        MinhaCalculadora calc = new MinhaCalculadora();
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }

        calc.soma(1, 2);
        calc.soma(1.0, 2.0);
        calc.soma(1, 2, 3);
        calc.soma(numeros);
    }
}
