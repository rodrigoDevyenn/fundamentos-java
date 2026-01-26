package com.rodrigoleite.fundamentosjava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBundle {

    public static void main(String[] args) {
        
        System.out.println("Locale atual: " + Locale.getDefault());
        ResourceBundle rc = ResourceBundle.getBundle("meu-texto");
        System.out.println("Olá: " + rc.getString("hello"));
        System.out.println("Mundo: " + rc.getString("world"));

        Locale.setDefault( new Locale("en_BR", "en_BR"));
        rc = ResourceBundle.getBundle("meu-texto");
        System.out.println("Olá: " + rc.getString("hello"));
        System.out.println("Mundo: " + rc.getString("world"));
    }
}
