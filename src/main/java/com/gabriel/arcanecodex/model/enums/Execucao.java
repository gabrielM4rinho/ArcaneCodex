package com.gabriel.arcanecodex.model.enums;

public enum Execucao {

    ACAO_PADRAO("Ação Padrão"),
    ACAO_COMPLETA("Ação Completa"),
    ACAO_LIVRE("Ação Livre"),
    REACAO("Reação");

    private final String descricao;

    Execucao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}