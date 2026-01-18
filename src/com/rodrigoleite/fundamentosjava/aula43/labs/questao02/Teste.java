package com.rodrigoleite.fundamentosjava.aula43.labs.questao02;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Contribuinte[] contribuintes = new Contribuinte[6];
        String nome;
        int tipoCadastro;
        String cadastro;
        double rendaBruta;
        
        for (int i = 0; i < 6; i++){
            System.out.println("Escolha o tipo de cadastro:\n1 - Pessoa Física.\n2 - Pessoa Juridica.");
            tipoCadastro = scan.nextInt();
            scan.nextLine();

            if (tipoCadastro == 1){
                System.out.println("Entre com os dados do contribuinte " + (i + 1) + ":");
                System.out.println("Nome:");
                nome = scan.nextLine();

                System.out.println("CPF:");
                cadastro = scan.nextLine();

                System.out.println("Renda Bruta:");
                rendaBruta = scan.nextDouble();

                PessoaFisica contribuintepf = new PessoaFisica();
                contribuintepf.setNome(nome);
                contribuintepf.setCpf(cadastro);
                contribuintepf.setRendaBruta(rendaBruta);

                contribuintes[i] = contribuintepf;

            } else if (tipoCadastro == 2){
                System.out.println("Entre com os dados do contribuinte " + (i + 1) + ":");
                System.out.println("Nome da Empresa:");
                nome = scan.nextLine();

                System.out.println("CNPJ:");
                cadastro = scan.nextLine();

                System.out.println("Renda Bruta:");
                rendaBruta = scan.nextDouble();

                PessoaJuridica contribuintepj = new PessoaJuridica();
                contribuintepj.setNome(nome);
                contribuintepj.setCnpj(cadastro);
                contribuintepj.setRendaBruta(rendaBruta);

                contribuintes[i] = contribuintepj;

            } else {

                System.out.println("Opcao inválida! Tente novamente.");
                i--;
            }

        }
        scan.close();
        ReceitaFederal receita = new ReceitaFederal();
        receita.setContribuintes(contribuintes);

        System.out.println(receita);
    }
}
