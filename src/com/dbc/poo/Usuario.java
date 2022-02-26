package com.dbc.poo;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    private String nome;
    private DadosPessoais dadosPessoais;
    private Endereco endereco;
    private Linguagens linguagem;
    private Genero genero;
    private Interesse interesse;

    private final List<Usuario> meusMatch = new ArrayList<>();

    public Usuario(){
    }

    public Usuario(String nome, DadosPessoais dadosPessoais, Endereco endereco, Linguagens linguagem, Genero genero, Interesse interesse) {
        this.nome = nome;
        this.dadosPessoais = dadosPessoais;
        this.endereco = endereco;
        this.linguagem = linguagem;
        this.genero = genero;
        this.interesse = interesse;
    }

    public List<Usuario> getMeusMatch() {
        return meusMatch;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Linguagens getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagens linguagem) {
        this.linguagem = linguagem;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Interesse getInteresse() {
        return interesse;
    }

    public void setInteresse(Interesse interesse) {
        this.interesse = interesse;
    }

    public void imprimirMeusDados(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", dadosPessoais=" + dadosPessoais +
                ", endereco=" + endereco +
                ", linguagem=" + linguagem +
                ", genero=" + genero +
                ", interesse=" + interesse +
                ", meusMatch=" + meusMatch +
                '}';
    }


}
