package com.dbc.poo.entities;

public class Match extends Usuario {

    public void darMatch(Usuario usuario, Usuario usuario2){
        if(usuario.getLinguagem().equals(usuario2.getLinguagem())){
            usuario.getMeusMatch().add(usuario2);
            usuario2.getMeusMatch().add(usuario);
            System.out.println("DEU MATCH POIS A LINGUAGEM DE PROGRAMAÇÃO É COMPATÍVEL");
        }else {
            System.out.println("INFELIZMENTE NÃO DEU MATCH POIS A LINGUAGEM DE PROGRAMAÇÃO É INCOMPATÍVEL");
        }
    }


    public void imprimirMeusMatch(Usuario usuario){
        usuario.getMeusMatch().forEach(System.out::println);
    }

}
