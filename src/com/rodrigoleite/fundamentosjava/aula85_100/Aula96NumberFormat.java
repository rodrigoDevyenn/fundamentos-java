package com.rodrigoleite.fundamentosjava.aula85_100;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Aula96NumberFormat {

    public static void main(String[] args) {
        
        // 1.000,00 - Brasil
        // 1,000.00 - EUA

        Locale en = Locale.forLanguageTag("en-US");
        NumberFormat nf = NumberFormat.getInstance(en);

        String num = nf.format(100.99);
        System.out.println(num);

        Locale br = Locale.forLanguageTag("pt-BR");
        nf = NumberFormat.getInstance(br);

        num = nf.format(100.99);
        System.out.println(num);

        System.out.println();

        // MOEDA
        NumberFormat moeda = NumberFormat.getCurrencyInstance(en);

        String valor = moeda.format(100.99);
        System.out.println(valor);

        Currency currency = moeda.getCurrency();
        System.out.println(currency);

        NumberFormat moeda2 = NumberFormat.getCurrencyInstance(br);

        valor = moeda2.format(100.99);
        System.out.println(valor);

        currency = moeda2.getCurrency();
        System.out.println(currency);

        // PORCENTAGEM
        NumberFormat porcentagem = NumberFormat.getPercentInstance();
        String porcent = porcentagem.format(99.989);
        System.out.println(porcent);

        porcentagem.setMaximumIntegerDigits(4);
        porcentagem.setMinimumIntegerDigits(1);

        porcentagem.setMaximumFractionDigits(2);
        porcentagem.setMinimumFractionDigits(1);

        porcent = porcentagem.format(99.989);
        System.out.println(porcent);

        // ARREDONDAMENTO

        nf.setRoundingMode(RoundingMode.DOWN);
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(99.50));

    }
}
