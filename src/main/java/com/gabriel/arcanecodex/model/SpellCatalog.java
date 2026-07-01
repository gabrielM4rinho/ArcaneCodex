package com.gabriel.arcanecodex.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpellCatalog {

    private String versao;

    @Builder.Default
    private List<Magia> magias = new ArrayList<>();

}