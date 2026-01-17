package com.rodrigoleite.fundamentosjava.aula42;

public class Teste {

    public static void main(String[] args){

        // A palavra final, informa que uma variavel não pode mudar, ou seja, uma constante.
        // A palavra final em uma classe, quer dizer que esta classe não pode ser extendida.

        System.out.println(Constantes.PI);
        System.out.println(Constantes.ALGO_IMUTAVEL);

        // São convensões java para constantes.
        // 1 - Declarar variáveis com nomes em CAIXA_ALTA serparadas por _
        // 2 - Adicinar o static, pois assim consegue acessar chamando somente a classe.

            
        
    }
}
