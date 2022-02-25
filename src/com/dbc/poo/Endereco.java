package com.dbc.poo;

public class Endereco {

    private String logradouro;
    private Integer numero;
    private String cidade;

    public Endereco() {
    }

    public Endereco(String logradouro, Integer numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void imprimirEndereco(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro='" + logradouro + '\'' + ", numero=" + numero + ", cidade='" + cidade + '\'' + '}';
    }
}
