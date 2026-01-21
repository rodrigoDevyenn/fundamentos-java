package com.rodrigoleite.fundamentosjava.aula60;

public class Teste {

    public static void main(String[] args) {
        
        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);

        System.out.println(escopo.getValor()); 
            // Sabemos que será 10;

        System.out.println(escopo.calculaValor(20)); 
            /* 10 ou 30? a resposta é 30, pois o método soma o 
             valor passado por parâmetro(20) + 10; */

        System.out.println(escopo.getValor());
            /* 10, pois o valor que o metodo calculaValor não 
             era o atributo da classe; e sim apenas uma 
             variável local do método. Nesse caso, para referenciar
             o atributo da classe, teria que ser o usado o this.*/

        System.out.println(escopo.teste());
            /*O retorno desse metodo pode ser 4 ou 9:
            4 - sendo o resultado da decrementação da variavel local valor
            9 - sendo o resultado da decrementação do atributo da classe
            Resultado = 4, pois o calculo é feito com a variável local declarada
            dentro do método, e ela só existe nesse método, ou seja, o método é seu
            escopo. */

        System.out.println(escopo.getValor());
            /*O resultado continua sendo 10, já que não foi
            modificado o atributo da classe, mas se tivesse utilizado
            this.valor = valor, aí sim, haveria uma alteração no atributo
            que retornaria 4 */
    }
}
