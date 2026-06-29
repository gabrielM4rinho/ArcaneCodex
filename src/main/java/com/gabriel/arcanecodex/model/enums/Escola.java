package com.gabriel.arcanecodex.model.enums;

public enum Escola {

    ABJURACAO("Abjuração"),
    ADIVINHACAO("Adivinhação"),
    CONJURACAO("Conjuração"),
    ENCANTAMENTO("Encantamento"),
    EVOCACAO("Evocação"),
    ILUSAO("Ilusão"),
    NECROMANCIA("Necromancia"),
    TRANSMUTACAO("Transmutação");

    private final String descricao;

    Escola(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}