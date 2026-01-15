package com.rodrigoleite.fundamentosjava.aula34;

public class TesteMinhaCalculadora {

    public static void main(String[] args) {
        
        //Não é nesccessário criar uma instância da classe para chamar seus métodos staticos.
        
        //MinhaCalculadora calc = new MinhaCalculadora();
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }

        //calc.soma(1, 2);
        MinhaCalculadora.soma(1,  2);

        //calc.soma(1.0, 2.0);
        MinhaCalculadora.soma(1.0, 2.0);

        //calc.soma(1, 2, 3);
        MinhaCalculadora.soma(1, 2, 3);

        //calc.soma(numeros);
        MinhaCalculadora.soma(numeros);
    }
}
