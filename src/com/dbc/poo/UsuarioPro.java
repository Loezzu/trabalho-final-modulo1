package com.dbc.poo;



public class UsuarioPro extends Usuario{

    private String whatsapp;

    public UsuarioPro() {
    }

    public UsuarioPro(String nome, DadosPessoais dadosPessoais, Endereco endereco, Linguagens linguagem, Genero genero, Interesse interesse, String whatsapp) {
        super(nome, dadosPessoais, endereco, linguagem, genero, interesse);
        this.whatsapp = whatsapp;
    }


    public String getWhatsapp() {
        return whatsapp;
    }

    public String setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
        return whatsapp;
    }

    public void imprimirUsuarioPro() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "UsuarioPro{" +
                "nome='" + getNome() + '\'' +
                ", dadosPessoais=" + getDadosPessoais() +
                ", endereco=" + getEndereco() +
                ", linguagem=" + getLinguagem() +
                ", genero=" + getGenero() +
                ", interesse=" + getInteresse() +
                ", whatsapp='" + whatsapp  +
                '}';
    }
}
