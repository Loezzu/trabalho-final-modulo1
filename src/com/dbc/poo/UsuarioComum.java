package com.dbc.poo;

public class UsuarioComum extends Usuario{

    public UsuarioComum() {
    }

    public UsuarioComum(String nome, Integer idade, String email, Linguagens linguagem, Genero genero, Interesse interesse) {
        super(nome, idade, email, linguagem, genero, interesse);
    }
}
