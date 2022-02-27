package com.dbc.poo;

public class UsuarioFree extends Usuario {
    public UsuarioFree() {
    }

    public UsuarioFree(String nome, DadosPessoais dadosPessoais, Endereco endereco, Linguagens linguagem, Genero genero, Interesse interesse) {
        super(nome, dadosPessoais, endereco, linguagem, genero, interesse);
    }

    public void imprimirUsuarioFree(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "UsuarioFree{" +
                "nome='" + getNome() + '\'' +
                ", dadosPessoais=" + getDadosPessoais() +
                ", endereco=" + getEndereco() +
                ", linguagem=" + getLinguagem() +
                ", genero=" + getGenero() +
                ", interesse=" + getInteresse() +
                '}';
    }
}
