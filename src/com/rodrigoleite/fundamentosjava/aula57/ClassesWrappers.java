package com.rodrigoleite.fundamentosjava.aula57;

public class ClassesWrappers {


    public static void main(String[] args){

        //Inteiros
        byte num1 = 10;
        short num2 = 100;
        int num3 = 1000;
        long num4 = 10000l;

        //Ponto flutuante
        float num5 = 3.5f;
        double num6 = 3.555555555;

        //Logicos
        boolean flag1 = true;
        boolean flag2 = false;

        //Alfabeticos
        char a = 'a';

        //Classes Wrappers

        Byte num7 = new Byte(num1); //Caso seja passado um número, deve ser convertido com o (cast).
        Byte num8 = new Byte("10");
        System.out.println(num7.getClass() + " e " + num8.getClass());

        Short num9 = new Short(num2);
        Short num10 = new Short("100");
        System.out.println(num9.getClass() + " e " + num10.getClass());

        Integer num11 = new Integer(num3);
        Integer num12 = new Integer("1000");
        System.out.println(num11.getClass() + " e " + num12.getClass());

        Long num13 = new Long(num4);
        Long num14 = new Long("10000");
        System.out.println(num13.getClass() + " e " + num14.getClass());

        Float num15 = new Float(num5);
        Float num16 = new Float("3.5");
        System.out.println(num15.getClass() + " e " + num16.getClass());

        Double num17 = new Double(num6);
        Double num18 = new Double("3.5555555");
        System.out.println(num17.getClass() + " e " + num18.getClass());

        Boolean flag3 = new Boolean(flag1);
        Boolean flag4 = new Boolean("true");
        Boolean flag5 = new Boolean(flag2);
        Boolean flag6 = new Boolean("false");
        System.out.println(flag3.getClass() + ", " + flag4.getClass() + ", " + flag5.getClass() + " e " + flag6.getClass());

        Character b = new Character(a);
        System.out.println(b.getClass());



    }
}
