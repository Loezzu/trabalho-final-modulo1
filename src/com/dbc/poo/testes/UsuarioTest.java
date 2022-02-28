package com.dbc.poo.testes;

import com.dbc.poo.*;
import org.junit.Test;

public class UsuarioTest {


    @Test
    public void deveImprimirMeusDados() {
        // Arrange
        UsuarioFree user = new UsuarioFree("João", new DadosPessoais(20, "joãozinho@gmail.com"), new Endereco("rua jose", 123, "gravataí"), Linguagens.JAVA, Genero.MASCULINO, Interesse.MULHER);

        // Act
        user.imprimirUsuario();

        // Assert
        assert(user.toString().equals("UsuarioFree{nome='João', dadosPessoais=DadosPessoais{idade=20, email='joãozinho@gmail.com'}, endereco=Endereco{logradouro='rua jose', numero=123, cidade='gravataí'}, linguagem=JAVA, genero=MASCULINO, interesse=MULHER}"));

    }
}
