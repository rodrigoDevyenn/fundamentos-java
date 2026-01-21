package com.rodrigoleite.fundamentosjava.aula61;

public class Teste {

    public static void main(String[] args) {
        
        Contato contato = new Contato("Contato 1", "1234-5678", "contato1@gmail.com");
        int valor = 5;

        System.out.println("-----Valores Originais----");
        System.out.println(contato);
        System.out.println(valor);

        System.out.println("Exemplo 1");
        //EXEMPLO 01

        testePassagemValorReferencia(valor, contato);
        System.out.println(contato);
        System.out.println(valor);

        
        System.out.println("Exemplo 2");
        //EXEMPLO 02

        testePassagemValorReferencia2(valor, contato);
        System.out.println(contato);
        System.out.println(valor);

        /*Explicando:
         Quando passamos algo como parâmetro, nós estamos criando um cópia localmente no escopo do método daquilo, se o parâmetro for um tipo primitivo, será criado uma nova variável local e seu valor será a cópia do valor passando como parâmetro. Mas se o parâmetro for um objeto, o que está sendo passado é na verdade a referência do endereço de memória na qual estão os atributos daquele objeto.
            - No primeiro método nos alteramos o valor apenas da cópia local da variável valor, já o objeto, nós passamos a referência daqule objeto, mas dentro do método nós criamos uma nova instância, ou seja, os valores atribuidos dentro do método na verdade foram para uma nova instância com um referência de memória diferente das que nós passamos pelo parâmetro.
            - No segundo método, a diferença primordial, é que ao invés de criar uma nova instância , nós usamos a mesma referência que foi copiada do objeto passado nos parâmetros, ou seja nós alteramos os atributos referenciados pela referência passada nos parâmetros, e isso fez o valor da instância glonal do main ser alterada.
        Com isso, nós aprendemos que, tem muita diferença em passar valor e passar referência por parâmetros.*/

    }

    private static void testePassagemValorReferencia(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato 2", "9999-9999", "contato2@gmai.com");
    }

    private static void  testePassagemValorReferencia2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato " + valor);
    }
}
