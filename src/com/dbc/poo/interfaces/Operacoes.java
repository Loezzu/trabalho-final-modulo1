package com.dbc.poo.interfaces;

import com.dbc.poo.entities.Usuario;

import java.util.List;

public interface Operacoes {

    void cadastrarUsuario(Usuario usuario);
    void listarTodosUsuarios();
    List<Usuario> listarUsuariosDisponiveis(Usuario usuario);
    void exibirUsuarios(List<Usuario> usuarios);
    void removerUsuarioPorIndice(int index);
    void editarUsuario(int index, Usuario usuario);
}
