package com.dbc.poo.entities;


import java.util.List;
import java.util.Scanner;

public class Like {

    Scanner sc = new Scanner(System.in);


    public void imprimirLikes(Usuario usuario1) {
        for(Usuario usuario : usuario1.getMeusLikes()){
            System.out.println(usuario.getNome());
        }
    }

    public void exibirOpcoes(List<Usuario> usuariosDisponiveis, Usuario usuarioAtual) {
        boolean deuMatch = false;
        for (Usuario usuarioOpcao : usuariosDisponiveis) {
            System.out.println(usuarioOpcao);
            System.out.println("\nDeseja dar like? (s/n)");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")) {
                deuMatch = darLike(usuarioAtual, usuarioOpcao);

            }
        }
        System.out.println("\n==========================================================");
        System.out.println("\nNão há mais nenhum usuário disponível para dar like");
        System.out.println("\n==========================================================");

    }

    public boolean darLike(Usuario usuario1, Usuario usuario2)  {
        if (usuario1.equals(usuario2)) {
            System.out.println("No puedes dar like a ti mismo");
        } else {
            usuario1.getMeusLikes().add(usuario2);
        }
       if(usuario2.getMeusLikes().contains(usuario1) && usuario1.getMeusLikes().contains(usuario2)){
           System.out.println("Podemos ter um casal, pois: " + usuario1.getNome() + " e " + usuario2.getNome() + " trocaram likes");
           System.out.println("Estamos analisando um possivel Match...");
           try {
               Thread.sleep(3000);
               Match match = new Match();
               match.darMatch(usuario1, usuario2);
               return true;
           }
           catch (InterruptedException e){
               e.printStackTrace();
           }
       }
       return false;
    }



}
