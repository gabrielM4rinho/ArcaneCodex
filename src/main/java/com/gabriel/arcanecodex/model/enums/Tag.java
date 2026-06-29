package com.gabriel.arcanecodex.model.enums;

public enum Tag {

    // Função
    DANO("Dano"),
    CURA("Cura"),
    SUPORTE("Suporte"),
    CONTROLE("Controle"),
    UTILIDADE("Utilidade"),

    // Área de efeito
    AREA("Área"),
    ALVO_UNICO("Alvo Único"),
    MULTIPLOS_ALVOS("Múltiplos Alvos"),

    // Elementos
    FOGO("Fogo"),
    GELO("Gelo"),
    ELETRICIDADE("Eletricidade"),
    ACIDO("Ácido"),
    LUZ("Luz"),
    TREVAS("Trevas"),

    // Buffs/Debuffs
    BUFF("Buff"),
    DEBUFF("Debuff"),

    // Mobilidade
    MOVIMENTO("Movimento"),
    TELEPORTE("Teleporte"),

    // Invocação
    INVOCACAO("Invocação"),

    // Exploração
    EXPLORACAO("Exploração"),

    // Controle mental
    MENTE("Mente");

    private final String descricao;

    Tag(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}