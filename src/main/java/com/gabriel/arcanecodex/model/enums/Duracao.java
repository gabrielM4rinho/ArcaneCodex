package com.gabriel.arcanecodex.model.enums;

public enum Duracao {

    INSTANTANEA("Instantânea"),
    CENA("Cena"),
    SUSTENTADA("Sustentada"),
    PERMANENTE("Permanente"),
    ESPECIAL("Especial");

    private final String descricao;

    Duracao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}