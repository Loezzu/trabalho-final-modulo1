package com.dbc.poo;


import java.util.Random;

public class Like {

    private String like;

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public void imprimirLikes(Usuario usuario1) {
        for(Usuario usuario : usuario1.getMeusLikes()){
            System.out.println(usuario.getNome());
        }
    }


    public void darLike(Usuario usuario1, Usuario usuario2) {
        if (usuario1.equals(usuario2)) {
            System.out.println("No puedes dar like a ti mismo");
        } else {
            usuario1.getMeusLikes().add(usuario2);
        }
       if(usuario2.getMeusLikes().contains(usuario1) && usuario1.getMeusLikes().contains(usuario2)){
           System.out.println("Temos um casal pois " + usuario1.getNome() + " e " + usuario2.getNome() + " trocaram likes");
       }
    }


}
