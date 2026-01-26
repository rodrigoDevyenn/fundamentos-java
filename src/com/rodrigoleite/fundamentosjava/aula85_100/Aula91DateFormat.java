package com.rodrigoleite.fundamentosjava.aula85_100;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

    public static void main(String[] args) {
        
        Date hoje = new Date();
        System.out.println(Locale.getDefault());

        String hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance(DateFormat.SHORT).format(hoje);
        System.out.print(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(" " + hojeFormatado);
    }
}
