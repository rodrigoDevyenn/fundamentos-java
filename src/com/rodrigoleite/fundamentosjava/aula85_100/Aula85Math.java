package com.rodrigoleite.fundamentosjava.aula85_100;

public class Aula85Math {

    public static void main(String[] args) {

        /* Biblioteca Math */

        /* sqrt(): Raiz Quadrada */
        System.out.println(Math.sqrt(4));
        
        /* cbrt(): Raiz Cúbica */
        System.out.println(Math.cbrt(8));

        /* pow(): Pontenciação */
        System.out.println(Math.pow(2, 3)); // 8

        /* ceil(): Arredondamento para cima */
        System.out.println(Math.ceil(4.7)); // 5
        System.out.println(Math.ceil(4.4)); // 5

        /* floor(): Arredondamento para baixo */
        System.out.println(Math.floor(4.7)); // 4
        System.out.println(Math.floor(4.4)); // 4

        /* round(): Arredondamento dinâmico(arredonda pra cima quando acima de .5 e arredonda para baixo quando abaixo de .5) */
        System.out.println(Math.round(4.7)); // 5
        System.out.println(Math.round(4.4)); // 4

        /* sin(): Seno de um número em radianos. Obs. Para usar graus, que é comumente mais utilizado usa-se o método toRadians() pasando o grau e convertendo em radianos. */
        System.out.println(Math.sin(Math.toRadians(30)));

        /* cos(): Cosseno de um número em radianos. Obs. Para usar graus, que é comumente mais utilizado usa-se o método toRadians() pasando o grau e convertendo em rad. */
        System.out.println(Math.cos(Math.toRadians(30)));

        /* tan(): Tangente de um número em radianos. Obs. Para usar graus, que é comumente mais utilizado usa-se o método toRadians() pasando o grau e convertendo em rad. */
        System.out.println(Math.tan(Math.toRadians(30)));
    }   
}
