package com.rodrigoleite.fundamentosjava.aula75_84;

public class Aula80 {

    public static void main(String[] args) {
        
        String teste = "Isso é um teste.";

        /*Método subsString(): retorna uma parte da string original, isto é, extrai um fragmento passado por parâmetros atravéz dos indice, podendo ser somente o inicio omitindo o final(extrai do inicio até o final da String) ou delimitando atravez do indice inicio e fim(final exclusivo) */

        System.out.println(teste); // Isso é um teste.
        System.out.println(teste.substring(10)); // teste.
        System.out.println(teste.substring(10, 15)); // teste

        /*Método concat(): retorna uma string concatenada, é o mesmo que fazer (stringA + stringB), não é muito utilizado no dia a dia */

        String ola = "Olá";
        String mundo = " mundo";
        String olaMundo = ola.concat(mundo);
        System.out.println(olaMundo); // Olá mundo

        /*Método replace(): substitui um caractere em uma string por outro, usado bastante para formatações de entrada. */

        /*Método replaceAll(): substitui todas as ocorrências de um caractere por outro */

        String espacos = "i s p a ç o ";
        String espacosCorreta = espacos.replace('i', 'e');
        String corretaSemEspacos = espacosCorreta.replaceAll(" ", "");
        
        System.out.println(espacos); // i s p a ç o
        System.out.println(espacosCorreta); // e s p a ç o
        System.out.println(corretaSemEspacos); //espaço

        /*Método trim(): remove todos os espaços que estão sobrando antes e depois de uma string */

        String nome = " meu nome é: ";
        System.out.println(nome); // | meu nome é: |
        System.out.println(nome.trim()); // |meu nome é:|
        System.out.println(nome);
    }
}
