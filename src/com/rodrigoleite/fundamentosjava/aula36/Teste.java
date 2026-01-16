package com.rodrigoleite.fundamentosjava.aula36;

public class Teste {
     
    public static void main(String[] args){

        Contato contato = new Contato();
        contato.setNome("Tyrion");
        //contato.setEndereco("Teresina");
        //contato.setTelefone("11 99999-9999");

        // Criar o objero endereco
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Game Of Thrones");
        endereco.setNumero("111");
        endereco.setCidade("KingsLanding");
        endereco.setEstado("Westeros");
        endereco.setCep("00000-001");
        endereco.setComplemento("-");

        contato.setEndereco(endereco);

        //Criar o objeto telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("11");
        telefone2.setNumero("93288-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        
        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/
        if (contato != null && contato.getTelefones() != null){
            System.out.println("Telefones: ");
            for (Telefone tel : contato.getTelefones()){
                System.out.println("  - " + tel.getDdd() + " " + tel.getNumero());
            }
        }
    }

}
