package com.rodrigoleite.fundamentosjava.aula11;

public class CuriosidadeInteiros {
    public static void main(String[] args) {
        
        int var1 = 2147483647; //número maximo do tipo int
        int var2 = 3;
        
        System.out.println(var1 + var2);
        //Quando tenta imprimir o resultando da soma que ultrapassa o limite do int, ele volta para os números negativos e continua somando.
        //Isto é, se somar 1 com 2147483647, você terá -2147483648, se somar 2, terá -2147483647.
    }
}
