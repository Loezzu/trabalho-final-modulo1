package com.dbc.poo;

public interface Operacoes {

    void cadastrarUsuario(Usuario usuario);
    void listarUsuarios();
    void listarUsuariosDisponiveis(Usuario usuario);
    void removerUsuarioPorIndice(int index);
    void editarUsuario(int index, Usuario usuario);

}
