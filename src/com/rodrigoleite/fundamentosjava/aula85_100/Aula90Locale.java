package com.rodrigoleite.fundamentosjava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

    public static void main(String[] args) {
        
        /* BR  dd/mm/yyyy */
        /* EUA mm/dd/yyyy */

        /* BR  1.000,00 */
        /* EUA 1,000.00 */

        Locale locale = Locale.getDefault();

        System.out.println(locale); // pt-BR

        Locale[] locales = Locale.getAvailableLocales();

        for (Locale loc : locales){
            System.out.println("Nome: " + loc.getDisplayName());
            System.out.println("Código da Língua: " + loc.getLanguage());
            System.out.println("Língua: " + loc.getDisplayLanguage());
            System.out.println("Código do Páis: " + loc.getCountry());
            System.out.println("Páis: " + loc.getDisplayCountry());
            System.out.println("-----------------------------");
        }
        /*Codigo para setar o locale do sistema */
        Locale br = new Locale("pt", "BR");
        Locale.setDefault(br);
        System.out.println(Locale.getDefault());


        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(500000000d));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf1.format(500000000d));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(nf2.format(500000000d));
    }
}
