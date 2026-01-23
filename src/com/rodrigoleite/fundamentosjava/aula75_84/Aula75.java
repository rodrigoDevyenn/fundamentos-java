package com.rodrigoleite.fundamentosjava.aula75_84;

public class Aula75 {

    public static void main(String[] args) {
        
        String vazia = new String();
        System.out.println(vazia);

        String java = new String("JAVA");
        System.out.println(java);              //JAVA

        String java1 = new String(java);
        System.out.println(java1);             //JAVA

        char[] charJava = {'J', 'A', 'V', 'A'};
        String javachar = new String(charJava);
        System.out.println(javachar);          //JAVA

        char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
        String abc = new String(abcdef, 0, 3);
        System.out.println(abc);               //ABC

        String bcd = new String(abcdef, 1, 3);
        System.out.println(bcd);

        byte[] ascii = {65, 66, 67, 68, 69};
        String abcde = new String(ascii);
        System.out.println(abcde);

        String java3 = "Java";
        String java4 = "java";
    }
}
