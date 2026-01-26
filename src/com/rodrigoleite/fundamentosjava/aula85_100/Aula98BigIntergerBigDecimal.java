package com.rodrigoleite.fundamentosjava.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigIntergerBigDecimal {

    public static void main(String[] args) {

        /*No Java, as operaçõe matemáticas não são muito seguras, e isso tem muito haver com a forma que o java foi feito, então para sistemas que usa muito disso como instituições financeiras não é recomendado o uso dos tipos primitivos para isso */
        
        double a = 0.03;
        double b = 0.04;
        double c = b - a;
        System.out.println(c); // 0.010000000002 - Errado!


        // Classe BigDecimal
        BigDecimal a_ = new BigDecimal("0.03");
        BigDecimal b_ = new BigDecimal("0.04");
        BigDecimal c_ = b_.subtract(a_);
        System.out.println(c_); // 0.01 - Corrreto

        BigDecimal bd1 = new BigDecimal(123456789.987654321);
        BigDecimal bd2 = new BigDecimal(987654321.123456789);
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(new BigDecimal(2)));

        //Classe BigInterger
        BigInteger bi = new BigInteger("10000000000000");
        System.out.println(bi);

    }
}
