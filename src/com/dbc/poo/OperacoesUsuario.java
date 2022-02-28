package com.dbc.poo;

import java.util.ArrayList;
import java.util.List;

public class OperacoesUsuario implements Operacoes{

    private final List<Usuario> usuariosList = new ArrayList<>();

    public OperacoesUsuario() {
    }

    public List<Usuario> getUsuariosList() {
        return usuariosList;
    }

    @Override
    public void cadastrarUsuario(Usuario user) {
        this.usuariosList.add(user);
    }

    @Override
    public void listarTodosUsuarios() {
        for (int i = 0; i < usuariosList.size(); i++) {
            System.out.println("Id = " + i + " | " + usuariosList.get(i));
        }
    }

    @Override
    public void listarUsuariosDisponiveis(Usuario usuario) {
        if(usuario.getInteresse().equals(Interesse.HOMEM)){
            for (int i = 0; i < usuariosList.size(); i++) {
                if(usuariosList.get(i).hashCode() != usuario.hashCode() && usuariosList.get(i).getGenero().equals(Genero.MASCULINO) && (usuariosList.get(i).getInteresse().equals(Interesse.HOMEM) || usuariosList.get(i).getInteresse().equals(Interesse.AMBOS))){
                    System.out.println("Id = " + i + " | " + usuariosList.get(i));
                }
            }
        } else if(usuario.getInteresse().equals(Interesse.MULHER)){
            for (int i = 0; i < usuariosList.size(); i++) {
                if(usuariosList.get(i).hashCode() != usuario.hashCode() && usuariosList.get(i).getGenero().equals(Genero.FEMININO) && (usuariosList.get(i).getInteresse().equals(Interesse.MULHER) || usuariosList.get(i).getInteresse().equals(Interesse.AMBOS))){
                    System.out.println("Id = " + i + " | " + usuariosList.get(i));
                }
            }
        }else if(usuario.getInteresse().equals(Interesse.AMBOS)){
            if(usuario.getGenero().equals(Genero.MASCULINO)){
                for (int i = 0; i < usuariosList.size(); i++) {
                    if(usuariosList.get(i).hashCode() != usuario.hashCode() && (usuariosList.get(i).getGenero().equals(Genero.MASCULINO) || usuariosList.get(i).getGenero().equals(Genero.FEMININO)) &&  (usuariosList.get(i).getInteresse().equals(Interesse.AMBOS) || usuariosList.get(i).getInteresse().equals(Interesse.HOMEM))){
                        System.out.println("Id = " + i + " | " + usuariosList.get(i));
                    }
                }
            }else{
                for (int i = 0; i < usuariosList.size(); i++) {
                    if(usuariosList.get(i).hashCode() != usuario.hashCode() && (usuariosList.get(i).getGenero().equals(Genero.MASCULINO) || usuariosList.get(i).getGenero().equals(Genero.FEMININO)) &&  (usuariosList.get(i).getInteresse().equals(Interesse.AMBOS) || usuariosList.get(i).getInteresse().equals(Interesse.MULHER))){
                        System.out.println("Id = " + i + " | " + usuariosList.get(i));
                    }
                }
            }
        }
    }

    @Override
    public void removerUsuarioPorIndice(int index) {
        this.usuariosList.remove(index);
    }



    @Override
    public void editarUsuario(int index, Usuario usuario) {
        Usuario usuarioProcurado = usuariosList.get(index);

        if(usuario instanceof UsuarioPro){
            if(((UsuarioPro) usuario).getWhatsapp() != null){
                ((UsuarioPro) usuarioProcurado).setWhatsapp(((UsuarioPro) usuario).getWhatsapp());
            }
        }
        if(usuario.getDadosPessoais() != null){
            usuarioProcurado.setDadosPessoais(usuario.getDadosPessoais());
        }
        if(usuario.getInteresse() != null){
            usuarioProcurado.setInteresse(usuario.getInteresse());
        }
        if(usuario.getGenero() != null){
            usuarioProcurado.setGenero(usuario.getGenero());
        }
        if(usuario.getNome() != null){
            usuarioProcurado.setNome(usuario.getNome());
        }
        if(usuario.getLinguagem() != null){
            usuarioProcurado.setLinguagem(usuario.getLinguagem());
        }
        if(usuario.getEndereco() != null){
            usuarioProcurado.setEndereco(usuario.getEndereco());
        }
    }


}
