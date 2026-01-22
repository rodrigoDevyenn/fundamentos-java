package com.rodrigoleite.fundamentosjava.aula66;

import com.rodrigoleite.fundamentosjava.aula61.Contato;

public class GarbageColletor {

    public static void main(String[] args) {
        
        Contato[] contatos = new Contato[1000000];
        for (int i = 0; i < contatos.length; i++){
            Contato contato = new Contato("Contato" + i, "12345-6789", "contato@gamil.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos Criados.");
        getMemoriaUsada();

        contatos = null;
        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();

        System.out.println("Contatos Apagados.");
        getMemoriaUsada();

    }

    private static void getMemoriaUsada(){
        final int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
    }
}
