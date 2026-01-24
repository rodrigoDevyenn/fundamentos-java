package com.rodrigoleite.fundamentosjava.aula75_84;

public class Aula78 {

    public static void main(String[] args) {
        
        String ola = "Olá";
        String ola2 = "OLá";
        String ola3 = "Olá";

        System.out.println("Ola equals Ola2 = " + ola.equals(ola2));
        System.out.println("Ola equals Ola3 = " + ola.equals(ola3));

        System.out.println();

        System.out.println("Ola equaslIgnoreCase Ola2 = " + ola.equalsIgnoreCase(ola2));
        System.out.println("Ola equaslIgnoreCase Ola3 = " + ola.equalsIgnoreCase(ola3));

        String banana = "banana";
        String ana = "ana";
        String ban = "Ban";

        System.out.println(banana.regionMatches(1, ana, 0, 3));
        System.out.println(banana.regionMatches(2, ana, 1, 2));
        System.out.println(banana.regionMatches(true, 0, ban, 0, 3));

        System.out.println(banana.endsWith(ana));
        System.out.println(banana.startsWith(ban));

        String a = "a";
        String b = "b";
        String aMaiusculo = "A";

        System.out.println(a.compareTo(b)); // a > b = -1
        System.out.println(b.compareTo(a)); // a == b = 0
        System.out.println(b.compareTo(b)); // a < b = 1
        System.out.println(a.compareTo(aMaiusculo));
    }
}
