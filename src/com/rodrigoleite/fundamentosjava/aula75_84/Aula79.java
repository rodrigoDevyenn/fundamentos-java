package com.rodrigoleite.fundamentosjava.aula75_84;

public class Aula79 {

    public static void main(String[] args) {
        
        String banana = "banana";
        String ana = "ana";

        // metodo indexOf retorna o indice que algo foi encontrado em uma string.
        System.out.println(banana.indexOf('x')); // -1 : Não existe na string
        System.out.println(banana.indexOf('b')); // 0 : indice 0
        System.out.println(banana.indexOf('a')); // 1 : indice 1
        System.out.println(banana.indexOf(ana)); // 1 : indice 1

        //metodo lastIndexOf retorna o indice da ultima vez que algo é encontrado.
        System.out.println(banana.lastIndexOf('x')); // -1 : não encontrado
        System.out.println(banana.lastIndexOf('a')); // 5 : indice  5
        System.out.println(banana.lastIndexOf('b')); // 0 : indice 0
        System.out.println(banana.lastIndexOf(ana)); // 3 : indice 3

        //metodo contens retorna um booleano que indica se algo foi encontrado ou não.
        System.out.println(banana.contains("x")); // false
        System.out.println(banana.contains("a")); // true
        System.out.println(banana.contains("b")); // true
        System.out.println(banana.contains(ana)); // true
    }
}
