package com.gabriel.arcanecodex.model;

import com.gabriel.arcanecodex.model.enums.Alcance;
import com.gabriel.arcanecodex.model.enums.Duracao;
import com.gabriel.arcanecodex.model.enums.Escola;
import com.gabriel.arcanecodex.model.enums.Execucao;
import com.gabriel.arcanecodex.model.enums.Resistencia;
import com.gabriel.arcanecodex.model.enums.Tag;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Magia {

    private UUID id;

    // Informações
    private String nome;
    private int circulo;
    private Escola escola;

    // Mecanica
    private Execucao execucao;
    private Alcance alcance;
    private String alvo;
    private Duracao duracao;
    private String duracaoDescricao;
    private Resistencia resistencia;

    // Conteudo
    private String descricao;
    private String aprimoramentos;

    // Classificação
    @Builder.Default
    private Set<Tag> tags = new HashSet<>();

}

