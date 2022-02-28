package com.dbc.poo.tests;

import com.dbc.poo.entities.DadosPessoais;
import com.dbc.poo.entities.Endereco;
import com.dbc.poo.entities.UsuarioFree;
import com.dbc.poo.enums.Genero;
import com.dbc.poo.enums.Interesse;
import com.dbc.poo.enums.Linguagens;
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
