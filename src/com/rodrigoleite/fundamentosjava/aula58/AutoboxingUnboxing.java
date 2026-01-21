package com.rodrigoleite.fundamentosjava.aula58;

public class AutoboxingUnboxing {

    public static void main(String[] args) {
        
        //Auto boxing - Tranformando diretamente um valor uma classe wrapper.
        Byte num1 = 1; //  new Byte((byte) 1);
        Short num2 = 10; //  new Short((short) 10);
        Integer num3 = 100; //  new Integer((int) 100);
        Long num4 = 1000l; //  new Long(1000l);

        //Auto Un-boxing - Transformando um objeto em um tipo primitivo novamente.
        byte num5 = num1; // num1.byteValue();
        short num6 = num2; // num2.shortValue();
        int num7 = num3; // num3.intValue();
        long num8 = num4; // num4.longValue();

        //Autoboxing em expressões
        num3++;
        System.out.println(num3); //
        
        //mau uso - É melhor utilizar os tipos primitivos para fazer essas operações.
        Double a, b, c;
        a = 2.5;
        b = 3.0;
        c = 5.5;

        Double media = (a + b + c) / 3;
        System.out.println(media);
    }
}
