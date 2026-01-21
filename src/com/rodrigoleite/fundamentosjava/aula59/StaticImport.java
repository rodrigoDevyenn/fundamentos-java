package com.rodrigoleite.fundamentosjava.aula59;

import static java.lang.Math.pow; // importe do método pow(pontênciação) - Mais Elegante
import static java.lang.Math.sqrt; // importe do médoto sqrt(raiz quadrada) - Mais Elegante
//import static java.lang.Math.*; - importa todos os métodos da classe math

public class StaticImport {

    public static void main(String[] args) {
        
        double a = 8;
        double b = 4;
        double c = 16;

        // Como a classe math é estática, não precisa instânciar para usa-la, só chama o nome da classe e o método.
        System.out.println(Math.pow(a, b));
        System.out.println(Math.sqrt(c));

        // com o importe estatico, não é necessário passar o nome da classe;
        System.out.println(pow(a, b));
        System.out.println(sqrt(c));

    }
}
