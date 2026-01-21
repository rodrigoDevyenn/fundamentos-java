package com.rodrigoleite.fundamentosjava.aula56;

public class Pessoa {

    private TipoDocumento tipoDocumento;
    private String numDocumento;


    public Pessoa() {
    }


    public Pessoa(TipoDocumento tipoDocumento, String numDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
    }


    public TipoDocumento getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return this.numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }


    @Override
    public String toString() {
        return "{" +
            " tipoDocumento='" + getTipoDocumento() + "'" +
            ", numDocumento='" + getNumDocumento() + "'" +
            "}";
    }


}
