package com.rodrigoleite.fundamentosjava.aula36.labs.questao01;

public class Agenda {

    private String nomeAgenda;
    private Contato[] contatos;
    private String[] registros;
    private int qtdContatos;
    

    public Agenda(){

    }

    public Agenda(String nomeAgenda){
        this.nomeAgenda = nomeAgenda;
        this.contatos = new Contato[qtdContatos];
        this.registros = new String[qtdContatos];
        this.qtdContatos = 0;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    private int getQtdContatos(){
        return qtdContatos; 
    }

    public String[] getRegistros(){
        return registros;
    }

    public void setRegistros(String[] registros){
        this.registros = registros;
    }

    private boolean isEmpty(){
        return this.qtdContatos == 0;
    }

    public String obterAgenda(){
        if (isEmpty()){
            return "\nAgenda Sem Contatos!";
        }
        String infoAgenda = "\n" + getNomeAgenda() + ":\n\n";
        for (int i = 0; i < getRegistros().length; i++){
            infoAgenda += getRegistros()[i];
        }
        return infoAgenda;
    }

    public String obterContato(int indice){
        return getRegistros()[indice];
    }

    public void adicionarContato(String nome, String telefone, String email){
        Contato contato = new Contato(nome, telefone, email);
        redimensionarArrayContatos();
        getContatos()[getQtdContatos()] = contato;
        redimensionarArrayRegistros();
        getRegistros()[getQtdContatos()] = criarRegistro(contato);
        incrementarQtdContatos();
    }

    private void redimensionarArrayContatos(){
        Contato[] contatos = new Contato[this.contatos.length + 1];
        for (int i = 0; i < getQtdContatos(); i++){
            contatos[i] = getContatos()[i];
        }
        setContatos(contatos);
        
    }

    private void redimensionarArrayRegistros(){
        String[] registros = new String[this.registros.length + 1];
        for (int i = 0; i < getQtdContatos(); i++){
            registros[i] = getRegistros()[i];
        }
        setRegistros(registros);
        
    }

    private String criarRegistro(Contato contato){
        String registro = "Contato " + getQtdContatos() + ":\nNome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone() + "\nE-mail: " + contato.getEmail() + "\n\n";
        return registro;
    }

    private void incrementarQtdContatos(){
        this.qtdContatos++;
    }

    
}
