package com.dbc.poo;

public class UsuarioFree extends Usuario {
    public UsuarioFree() {
    }

    public UsuarioFree(String nome, DadosPessoais dadosPessoais, Endereco endereco, Linguagens linguagem, Genero genero, Interesse interesse) {
        super(nome, dadosPessoais, endereco, linguagem, genero, interesse);
    }
}
