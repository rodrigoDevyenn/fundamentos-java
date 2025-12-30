package com.rodrigoleite.fundamentosjava.aula11;

public class VariaveisChar {
    public static void main(String[] args) {
        
        char o = 'o';
        char i = 'i';

        //Dessa forma, ele irá somar o codigo ascii refernte aos carcateres
        System.out.println(o + i);

        //Adicionando ""+, ele irá concatenar o valor das variáveis.
        System.out.println(""+ o + i);

        //É possível passar o código ascii ao invés do caractere.
        char a = 97;
        char u = 117;

        System.out.println(a + u);
        System.out.println(""+ a + u);

        System.out.println(a + i);
        System.out.println(""+ a + i);

        System.out.println(o + u);
        System.out.println(""+ o + u);

        char interrogacao = 63;

        System.out.println(""+ o + i + interrogacao);
    }
}
