package com.dbc.poo.testes;

import com.dbc.poo.DadosPessoais;
import org.junit.Test;

public class DadosPessoaisTest {



    @Test
    public void deveImprimirDadosPessoais() {
        // Arrange
        DadosPessoais dadosPessoais = new DadosPessoais();
        dadosPessoais.setIdade(20);
        dadosPessoais.setEmail("teste@gmail.com");

        // Act
        dadosPessoais.imprimirDados();

        // Assert
        assert(dadosPessoais.toString().equals("DadosPessoais{idade=20, email='teste@gmail.com'}"));

    }
}
