package com.rodrigoleite.fundamentosjava.aula13;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        //Operações
        System.out.println("Resultado de Operações Aritméticas: \n");
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        //Operções equivalentes
        System.out.println("\nMostrando formas equivalentes de fazer a mesma operação:");
        int operacaoA = 1;
        int operacaoB = 1;

        operacaoA = operacaoA + 3;
        operacaoB += 3;

        operacaoA = operacaoA - 2;
        operacaoB -= 2;

        operacaoA = operacaoA * 2;
        operacaoB *= 2;

        operacaoA = operacaoA / 2;
        operacaoB /= 2;

        operacaoA = operacaoA % 2;
        operacaoB %= 2;
        System.out.println("A operação A = " + operacaoA );
        System.out.println("A operação B = " + operacaoB );

        //Operador incrementador
        System.out.println("\nResultado de Incrementação: ");
        int var = 0;
        System.out.println(var);
        var++;
        System.out.println(var);
        var++;
        System.out.println(var);

        //Operador decrementador
        System.out.println("\nResultado de Decrementação: ");
        System.out.println(var);
        var--;
        System.out.println(var);
        var--;
        System.out.println(var);

        //Diferenças de quando colocamos o operador de incrementação antes e depois em uma output.
        System.out.println("\nDiferenças de quando colocamos o operador de incrementação antes e depois em uma output.");
        int variavel = 5;
        System.out.println(variavel); //5

        //o operador depois significa que será feito primeiro o print e depois a incrementação, após a saida, variavel = 6
        System.out.println(variavel++); //5

        //o operador antes significa que será incrementado antes do print, ou seja, a variavel era 6 foi incrementada com mais 1 e foi impressa como 7
        System.out.println(++variavel); //7
        

        //O operador + também pode ser usado para concatenar strings:
        System.out.println("\nResultado de Concatenação:");
        String primeiraString = "Está é ";
        String segundaString = "uma string concatenada.\n";
        String terceiraString = primeiraString + segundaString;
        System.out.println(terceiraString);

    }
}
