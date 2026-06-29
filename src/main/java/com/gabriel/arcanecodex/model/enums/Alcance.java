package com.gabriel.arcanecodex.model.enums;

public enum Alcance {

    PESSOAL("Pessoal"),
    TOQUE("Toque"),
    CURTO("Curto"),
    MEDIO("Médio"),
    LONGO("Longo"),
    ILIMITADO("Ilimitado");

    private final String descricao;

    Alcance(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
