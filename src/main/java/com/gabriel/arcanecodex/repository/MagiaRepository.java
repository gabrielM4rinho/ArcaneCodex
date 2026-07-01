package com.gabriel.arcanecodex.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gabriel.arcanecodex.model.Magia;
import com.gabriel.arcanecodex.model.SpellCatalog;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public class MagiaRepository {

    private final ObjectMapper objectMapper;

    public MagiaRepository() {
        this.objectMapper = new ObjectMapper();
    }

    public SpellCatalog carregarMagias(){

        try (InputStream inputStream =
                     getClass()
                             .getClassLoader()
                             .getResourceAsStream("spells/magias.json")){

            if (inputStream == null){
                throw new IllegalStateException("Arquivo de magias não encontrado");
            }

            SpellCatalog catalog = objectMapper.readValue(inputStream, SpellCatalog.class);

            for (Magia magia : catalog.getMagias()){
                magia.setId(UUID.randomUUID());
            }

            return catalog;


        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar as magias.", e);
        }
    }

}
