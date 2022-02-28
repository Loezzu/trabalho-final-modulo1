package com.dbc.poo.testes;

import com.dbc.poo.*;
import org.junit.Test;

public class UsuarioProTest {

    @Test
    public void deveImprimirDadosDoUsuarioPro() {
        // Arrange
        UsuarioPro usuario = new UsuarioPro("João", new DadosPessoais(20, "joãozinho@gmail.com"), new Endereco("rua jose", 123, "gravataí"), Linguagens.JAVA, Genero.MASCULINO, Interesse.MULHER, "519999999");

        // Act
        usuario.imprimirUsuario();

        // Assert
        assert(usuario.toString().equals("UsuarioPro{nome='João', dadosPessoais=DadosPessoais{idade=20, email='joãozinho@gmail.com'}, endereco=Endereco{logradouro='rua jose', numero=123, cidade='gravataí'}, linguagem=JAVA, genero=MASCULINO, interesse=MULHER, whatsapp='519999999}"));

    }
}
