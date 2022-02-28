package com.dbc.poo;

public class UsuarioFree extends Usuario implements Imprimir {
    public UsuarioFree() {
    }

    public UsuarioFree(String nome, DadosPessoais dadosPessoais, Endereco endereco, Linguagens linguagem, Genero genero, Interesse interesse) {
        super(nome, dadosPessoais, endereco, linguagem, genero, interesse);
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

    @Override
    public void imprimirUsuario() {
        System.out.println(this);
    }
}
