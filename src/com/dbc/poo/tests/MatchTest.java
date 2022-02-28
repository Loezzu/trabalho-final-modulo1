package com.dbc.poo.tests;

import com.dbc.poo.entities.DadosPessoais;
import com.dbc.poo.entities.Endereco;
import com.dbc.poo.entities.Match;
import com.dbc.poo.entities.UsuarioFree;
import com.dbc.poo.enums.Genero;
import com.dbc.poo.enums.Interesse;
import com.dbc.poo.enums.Linguagens;
import org.junit.Test;

public class MatchTest {

    @Test
    public void deveDarMatch() {
        //Arrange
        UsuarioFree user1 = new UsuarioFree("João", new DadosPessoais(20, "joãozinho@gmail.com"), new Endereco("rua jose", 123, "gravataí"), Linguagens.JAVA, Genero.MASCULINO, Interesse.MULHER);
        UsuarioFree user2 = new UsuarioFree("Maria", new DadosPessoais(20, "mariazinha@gmail.com"), new Endereco("rua jose", 123, "gravataí"), Linguagens.JAVA, Genero.FEMININO, Interesse.HOMEM);
        Match match = new Match();

        //Act
        match.darMatch(user1, user2);

        //Assert
        assert(user1.getMeusMatch().contains(user2));
        assert(user2.getMeusMatch().contains(user1));

    }
}
