package com.dbc.poo.enums;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Interesse {

    HOMEM(Collections.singletonList(Genero.MASCULINO)),
    MULHER(Collections.singletonList(Genero.FEMININO)),
    AMBOS(Arrays.asList(Genero.MASCULINO, Genero.FEMININO));

    private final List<Genero> generoDeInteresse;

    Interesse(List<Genero> generoDeInteresse) {
        this.generoDeInteresse = generoDeInteresse;
    }

    public List<Genero> getGeneroDeInteresse() {
        return generoDeInteresse;
    }

    Interesse(List<Genero> generoDeInteresse, String descricao) {
        this.generoDeInteresse = generoDeInteresse;
    }

    public boolean isCompativel(Genero genero) {
        return generoDeInteresse.contains(genero);
    }
}
