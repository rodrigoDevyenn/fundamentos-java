package com.rodrigoleite.fundamentosjava.aula75_84;

public class Aula82 {

    public static void main(String[] args) {

        /*Método join(): Usado para juntar strings que podem ser passadas por parâmetro, incluisive do tipo varargs, primeiro passando o delimitador que vai agir com juntas das strings, e após os n elementos. */
        
        String alfabeto = String.join(", ", "A", "B", "C", "D");
        System.out.println(alfabeto);

        /*Método split(): Separa uma String baseado em um delimitador, o processo contrário do join */

        String[] letrasAlfabeto = alfabeto.split(", ");

        for (String letra : letrasAlfabeto){
            System.out.println(letra);
        }

        /*Obs. O split é muito utilizado para leituras e formatação de arquivos flat, por exemplo: */

        String doArquivo = "1;Antônio;30";
        String[] infos = doArquivo.split(";");
        Pessoa pessoa = new Pessoa(infos[0], infos[1], Integer.parseInt(infos[2]));

        System.out.println(pessoa);

    }
}
