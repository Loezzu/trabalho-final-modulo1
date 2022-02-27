package com.dbc.poo.testes;

import com.dbc.poo.Endereco;
import org.junit.Test;

public class EnderecoTest {

    @Test
    public void deveImprimirEndereco() {
        // Arrange
        Endereco endereco = new Endereco("Rua a", 123, "gravataí");

        // Act
        endereco.imprimirEndereco();

        // Assert
        assert(endereco.toString().equals("Endereco{logradouro='Rua a', numero=123, cidade='gravataí'}"));

    }
}
