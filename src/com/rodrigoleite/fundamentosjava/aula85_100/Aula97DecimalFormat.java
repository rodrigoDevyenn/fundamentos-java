package com.rodrigoleite.fundamentosjava.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97DecimalFormat {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        
        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);
        System.out.println(df.format(123456789.123));

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.forLanguageTag("en-US"));
        dfs.setDecimalSeparator('.');
        dfs.setGroupingSeparator(',');

        String padrao2 = "###,###.##";
        df = new DecimalFormat(padrao2, dfs);

        System.out.println(df.format(123456789.123));
    }
}
