package com.dbc.poo;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    private String nome;
    private Integer idade;
    private String email;
    private Linguagens linguagem;
    private Genero genero;
    private Interesse interesse;

    private List<Usuario> meusMatch = new ArrayList<>();

    public Usuario(){
    }

    public Usuario(String nome, Integer idade, String email, Linguagens linguagem, Genero genero, Interesse interesse) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.linguagem = linguagem;
        this.genero = genero;
        this.interesse = interesse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public void darMatch(Usuario usuario){
        if(getLinguagem().equals(usuario.getLinguagem())){
            meusMatch.add(usuario);
            usuario.meusMatch.add(this);
            System.out.println("DEU MATCH");
        }else {
            System.out.println("DEU RUIM");
        }
    }

    public void imprimirMeusMatch(){
        meusMatch.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", linguagem=" + linguagem +
                ", genero=" + genero +
                ", interesse=" + interesse +
                '}';
    }
}
