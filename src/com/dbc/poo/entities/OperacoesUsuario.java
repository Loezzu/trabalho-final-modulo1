package com.dbc.poo.entities;

import com.dbc.poo.interfaces.Operacoes;

import java.util.ArrayList;
import java.util.List;

public class OperacoesUsuario implements Operacoes {

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
    public List<Usuario> listarUsuariosDisponiveis(Usuario usuario) {
        List<Usuario> usuariosDisponiveis = new ArrayList<>();
        for (int i = 0; i < usuariosList.size(); i++) {
            Usuario usuarioAtual = usuariosList.get(i);
            if(usuarioAtual.hashCode() == usuario.hashCode() || usuario.getMeusLikes().contains(usuarioAtual)){
                continue;
            }
            if(usuario.getInteresse().isCompativel(usuarioAtual.getGenero()) && usuarioAtual.getInteresse().isCompativel(usuario.getGenero())){
                usuariosDisponiveis.add(usuarioAtual);
            }
        }
        return usuariosDisponiveis;
    }

    @Override
    public void exibirUsuarios(List<Usuario> usuarios)  {
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println("Id = " + i + " | " + usuarios.get(i));
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
