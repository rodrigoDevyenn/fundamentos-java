package com.rodrigoleite.fundamentosjava.aula62;

public class Varargs {

    public static void main(String[] args){

        System.out.println(soma(1, 2));
        System.out.println(soma(1, 2, 3));
        
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(soma(array));

        /*Nós podemos fazer métodos que recebem uma quantidade
        Obviamente limitada a declaração do método, mas, é possível
        passar uma quantidade ilimitada de parámentros através do
        varagrs(ClasseObjeto... parametros) */

        System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        /*Observações:
            - Dentro do método, ele vai funcionar como um array, mas quem chama o método
              poderá passar como array ou como parâmetros separados por vírgula normalmente
            - O varargs só funciona com objetos, ou seja, na declaração do método, o tipo do
              parâmetro deve ser uma classe(Integer, String, Double, Float e etc.
            - Sua funcionalidade é principalmente para casos que não sabemos quantos parâmetros
              precisamos passar*/
        
    }
    //Método que que recebe 2 parâmetros
    private static int soma(int a, int b){
        return a + b;
    }

    //Método melhorado para 3 parâmetros
    private static int soma(int a, int b, int c){
        return a + b + c;
    }

    //Método melhorado para um array de parâmetros
    private static int soma(int[] array){

        int soma = 0;

        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }
        return soma;
    }

    //Método melhorado para n parâmetros, seja com array ou não.(Varargs)
    private static int soma(Integer... array){

        int soma = 0;

        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }
        return soma;
    }
}
