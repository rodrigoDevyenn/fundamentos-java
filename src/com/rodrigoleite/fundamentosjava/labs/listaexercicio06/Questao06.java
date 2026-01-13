package com.rodrigoleite.fundamentosjava.labs.listaexercicio06;

import java.util.Date;

public class Questao06 {

    public static void main(String[] args){

        ContatoAgenda contato = new ContatoAgenda();

        contato.numero = "86 9 9999-9999";
        contato.nome = "Shirley Cosméticos";
        contato.operadora = "CLARO";
        contato.tipo = "Celular";
        contato.ehWhatsApp = true;
        contato.ehComercial = true;
        contato.salvoEm = new Date();
    }
}
