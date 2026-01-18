package com.rodrigoleite.fundamentosjava.aula43.labs.questao01;

public class Teste {

    public static void main(String[] args){

        System.out.println("----------Teste ContaBancaria----------\n");
        ContaBancaria contaSimples = new ContaBancaria();

        contaSimples.setNumConta("0111");
        contaSimples.setNomeCliente("Naruto");
        contaSimples.setSaldo(1500);

        imprimirConta(contaSimples);

        verificarStatusSaque(contaSimples, 1200);
        imprimirConta(contaSimples);

        verificarStatusDeposito(contaSimples,700);
        imprimirConta(contaSimples);

        verificarStatusSaque(contaSimples, 1200);
        imprimirConta(contaSimples);

        System.out.println("----------Teste ContaPoupanca----------\n");
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.setNumConta("0111");
        contaPoupanca.setNomeCliente("Naruto");
        contaPoupanca.setSaldo(1500);
        contaPoupanca.setDiaRendimento(5);

        imprimirConta(contaPoupanca);

        calcularNovoSaldoPoupanca(contaPoupanca);
        imprimirConta(contaPoupanca);

        System.out.println("Atualizando o dia de rendimento!\n");
        contaPoupanca.setDiaRendimento(18);
        imprimirConta(contaPoupanca);

        calcularNovoSaldoPoupanca(contaPoupanca);
        imprimirConta(contaPoupanca);

        verificarStatusDeposito(contaPoupanca, 100);
        imprimirConta(contaPoupanca);

        verificarStatusSaque(contaPoupanca, 1700);

        System.out.println("----------Teste ContaEspecial----------\n");
        ContaEspecial contaEspecial = new ContaEspecial();

        contaEspecial.setNumConta("0111");
        contaEspecial.setNomeCliente("Naruto");
        contaEspecial.setSaldo(1500);
        contaEspecial.setLimite(500);

        verificarStatusSaque(contaEspecial, 500);
        imprimirConta(contaEspecial);

        verificarStatusSaque(contaEspecial, 2000);
        imprimirConta(contaEspecial);

        verificarStatusSaque(contaEspecial, 1500);
        imprimirConta(contaEspecial);

        verificarStatusDeposito(contaEspecial, 300);
        imprimirConta(contaEspecial);


    }

    private static void verificarStatusSaque(ContaBancaria conta, double saque){
        System.out.println("Realizando saque de R$ " + saque + ".");
         if (conta.sacar(saque)){
            System.out.println("Saque realizado com sucesso!\n");
        } else {
            System.out.println("Saldo insuficiente!\n");
        }
    }

    private static void verificarStatusDeposito(ContaBancaria conta, double deposito){
        System.out.println("Depositando valor de R$ " + deposito + ".\n");
        conta.depositar(deposito);
    }

    private static void imprimirConta(ContaBancaria conta){
        System.out.println(conta);
    }

    private static void calcularNovoSaldoPoupanca(ContaPoupanca conta){
        System.out.println("Calculando o novo Saldo com rendimentos.");
        if (conta.calcularNovoSaldo(5)){
            System.out.println("Saldo atualizado com rendimentos!\n");
        } else{
            System.out.println("Fora do dia de rendimento da conta!\n");
        }
        
    }
}
