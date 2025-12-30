package com.rodrigoleite.fundamentosjava.aula10;

public class Variaveis {

    public static void main(String[] args) {
        
        //Convênsão Java
        int idade;
        String nome;
        String nomeDoMeuCachorro;
        String ano2014;

        //Aceito, mas não utilizado.
        int _idade;
        int $idade;

        //Não convênsão Java.
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;

        idade = 25;
        nome = "Rodrigo";

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        //má prática(definir variaveis com nomes que não se relacione com o que guardaram)
        int a = 20;
        String b = "Rodrigo";

    }
}
