package com.rodrigoleite.fundamentosjava.aula52.labs;

public class Agenda {

    private String nomeAgenda;
    private Contato[] contatos;

    public Agenda(String nomeAgenda){
        this.contatos = new Contato[5];
    }

    public void adicionarContato(Contato contato) throws AgendaCheiaException {
        if (Contato.contador <= this.contatos.length){
            contatos[contato.getId()] = contato;
        } else {
            throw new AgendaCheiaException();
        } 
    }

    public Contato consultarContato(String nome) throws ContatoNaoExisteException{ 
        for (Contato contato : this.contatos){
            if (contato != null){
                 if (contato.getNome().equalsIgnoreCase(nome)){
                    return contato;
                }
            }
        }
        throw new ContatoNaoExisteException();
    }

    public String toString(){
        String string = "Agenda: " + this.nomeAgenda + " - Capacidade: " + contatos.length + "\n\n";
        for (int i = 0; i < this.contatos.length; i++){
            string += contatos[i].toString();
            string += "\n";
        }
        return string;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }
    
    
}
