package com.gabriel.arcanecodex.model.enums;

public enum Resistencia {

    NENHUMA("Nenhuma"),
    FORTITUDE("Fortitude"),
    REFLEXOS("Reflexos"),
    VONTADE("Vontade");

    private final String descricao;

    Resistencia(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}