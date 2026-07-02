package com.gabriel.arcanecodex.filter;

import com.gabriel.arcanecodex.model.enums.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class SpellFilter {


    private Integer circuloMinimo;
    private Integer circuloMaximo;

    private Escola escola;
    private Execucao execucao;
    private Alcance alcance;
    private Resistencia resistencia;

    private Set<Tag> tags;

    private String nome;
    private String texto;

    private Boolean exigirTodasTags;

}
