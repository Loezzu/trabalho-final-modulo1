package com.dbc.poo;

public class Match extends Usuario{

    public void darMatch(Usuario usuario, Usuario usuario2){
        if(usuario.getLinguagem().equals(usuario2.getLinguagem())){
            usuario.getMeusMatch().add(usuario2);
            System.out.println("DEU MATCH");
        }else {
            System.out.println("DEU RUIM");
        }
    }


    public void imprimirMeusMatch(Usuario usuario){
        usuario.getMeusMatch().forEach(System.out::println);
    }

}
