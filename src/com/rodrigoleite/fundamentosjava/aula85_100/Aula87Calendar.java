
package com.rodrigoleite.fundamentosjava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

    public static void main(String[] args) {
        
        /*A Classe Calendar não aceita construtores, pois utiliza o padrão singleton, basicamente, é um padrão que garante que uma classe terá somente uma instância em um projeto, que é o caso da classe Calendar que ja possui uma instância, e só precisamos usar, usamos o método getInstance() para acessa-la*/
        Calendar hoje = Calendar.getInstance(); //singleton

        
        int ano = hoje.get(Calendar.YEAR); /* Para acessar o ano */
        int mes = hoje.get(Calendar.MONTH); /* Para acessar o mês. Obs. o mês em java começam com 0 e termina em 11*/
        int dia = hoje.get(Calendar.DAY_OF_MONTH); /* Para acessar o dia */
        int hora = hoje.get(Calendar.HOUR_OF_DAY); /* Para acessar a hora */
        int min = hoje.get(Calendar.MINUTE); /* Para acessar os minutos */
        int seg = hoje.get(Calendar.SECOND); /* Para acessar os segundos */

        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);
        System.out.println(hora);
        System.out.println(min);
        System.out.println(seg);

        System.out.printf("Hoje é %02d/%02d/%d %02d:%02d:%02d", dia, (mes + 1), ano, hora, min, seg); // dia/mes/ano h:m:s
        System.out.println();
        hoje.add(Calendar.DAY_OF_MONTH, 1); // Somar ao dia 
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH)); // 26
        hoje.add(Calendar.DAY_OF_MONTH, -2); // Subtrair ao dia 
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH)); // 24

        System.out.println();

        /*A Classe Calendar também tem algumas constantes que podemos usar */
        System.out.println(Calendar.JANUARY); // 0
        System.out.println(Calendar.FEBRUARY); // 1
        System.out.println(Calendar.MARCH); // 2
        System.out.println(Calendar.APRIL); // 3
        System.out.println(Calendar.MAY); //4
        System.out.println(Calendar.JUNE); // 5
        System.out.println(Calendar.JULY); // 6
        System.out.println(Calendar.AUGUST); // 7
        System.out.println(Calendar.SEPTEMBER); // 8
        System.out.println(Calendar.OCTOBER); // 9
        System.out.println(Calendar.NOVEMBER); // 10
        System.out.println(Calendar.DECEMBER); // 11

    }
}
