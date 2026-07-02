package com.gabriel.arcanecodex.service;

import com.gabriel.arcanecodex.filter.SpellFilter;
import com.gabriel.arcanecodex.model.Magia;
import com.gabriel.arcanecodex.model.SpellCatalog;
import com.gabriel.arcanecodex.repository.MagiaRepository;

import java.util.ArrayList;
import java.util.List;

public class MagiaService {

    private final MagiaRepository repository;

    public MagiaService() {
        this.repository = new MagiaRepository();
    }

    public List<Magia> buscar (SpellFilter filtro){

        List<Magia> magiasAprovadas = new ArrayList<>();

        SpellCatalog catalog = repository.carregarMagias();
        List<Magia> todasAsMagias = catalog.getMagias();

        for (Magia magia : todasAsMagias){
            if (SpellMatcher.matches(magia, filtro)){
                magiasAprovadas.add(magia);
            }
        }
        return magiasAprovadas;
    }

}
