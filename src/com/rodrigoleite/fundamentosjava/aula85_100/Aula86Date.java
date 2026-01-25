package com.rodrigoleite.fundamentosjava.aula85_100;

import java.util.Date;

public class Aula86Date {

    public static void main(String[] args) {
        
        Date hoje = new Date();
        System.out.println(hoje);

        /* getTime(): retorna o quantidade de milissegundos desde 1970 */
        System.out.println("Milissegunpdos desde 1970: " + hoje.getTime());

        /*getDate(): (obsoleto) retorna o dia do mês */
        System.out.println(hoje.getDate());
        


    }
}
