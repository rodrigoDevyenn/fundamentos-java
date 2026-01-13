package com.rodrigoleite.fundamentosjava.labs.listaexercicio07.contacorrente;

public class Questao02TesteContaCorrente {

    public static void main(String[] args){

        ContaCorrente conta1 = new ContaCorrente();
        conta1.numero = "111";
        conta1.saldo = 1500;
        conta1.statusEspecial = true;
        conta1.limite = 800;
        conta1.limiteDisponível = 800;

        ContaCorrente conta2 = new ContaCorrente();
        conta2.numero = "222";
        conta2.saldo = 400;
        conta2.statusEspecial = false;
        conta2.limite = 0;

        //Sacar
        System.out.println("\nConta 1: Saque 200");
        conta1.consultarSaldo();
        conta1.sacar(200);
        conta1.consultarSaldo();

        System.out.println("\nConta 2: Saque 800");
        conta2.consultarSaldo();
        conta2.sacar(800);
        conta2.consultarSaldo();

        System.out.println("\nConta 1: Saque 1700");
        conta1.consultarSaldo();
        conta1.sacar(1700);
        conta1.consultarSaldo();

        System.out.println("\nConta 1: Está usando Check Especial?");
        System.out.println(conta1.usandoCheckEspecial());

        //Depositar
        System.out.println("\nConta 1: Depósito 1600");
        conta1.consultarSaldo();
        conta1.depositar(1600);
        conta1.consultarSaldo();

        System.out.println("\nConta 2: Depósito 0");
        conta2.consultarSaldo();
        conta2.depositar(0);
        conta2.consultarSaldo();

        




    }
}
