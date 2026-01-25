package com.rodrigoleite.fundamentosjava.aula75_84;

public class Aula83 {

    public static void main(String[] args) {
        
        String[] letras = {"B", "C", "D", "E", "F"};
        String alfabeto = "";

        for (String letra : letras){
            alfabeto += letra;
        }

        System.out.println(alfabeto); // BCDEF

        /*Essa é a forma mais simples de concatenar várias Strings é utilizando o operador + ou += e ainda podemos utilizar um loop para iterar. Mas, é importante entender que essa forma é mais fácil de implementar mas não recomendada em questão de performace, já que strings no java são imutáveis, isto é, não estamos de fato concatenando strings, estamos criando uma nova string e copiando o valor da anterior e isso gera um custo muito grande em sistemas escaláveis*/

        /*Classe StringBuffer: */

        StringBuffer sb = new StringBuffer();
        for (String letra : letras){
            sb.append(letra);
        }
        alfabeto = sb.toString();

        System.out.println(alfabeto); // BCDEF

        /*Com a Classe StringBuffer podemos fazer a mesma coisa que o exemplo anterior, mas de uma forma mais elegante e com ganho de performace, além de que estamos falando de uma classe, ou seja, também podemos usar métodos uteis na concatenação */

        System.out.println(sb.reverse()); // FEDECB

        /*Da mesma forma que temos o StringBuffer, também temos a classe StringBuilder, que é basiacamente a mesma coisa, a diferença é que o StringBuffer é mais indicado para sistemas que usam mais de uma threads, mas o funcionamento é o mesmo, como mostrado a baixo.*/

        StringBuilder sb_ = new StringBuilder();
        for (String letra : letras){
            sb_.append(letra);
        }
        alfabeto = sb_.toString();

        System.out.println(alfabeto); // BCDEF


        
    }
}
