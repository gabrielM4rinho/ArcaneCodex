package com.gabriel.arcanecodex.ui;

import com.gabriel.arcanecodex.filter.SpellFilter;
import com.gabriel.arcanecodex.model.SpellCatalog;
import com.gabriel.arcanecodex.model.Magia;
import com.gabriel.arcanecodex.repository.MagiaRepository;
import com.gabriel.arcanecodex.service.MagiaService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        MagiaService service = new MagiaService();
        SpellFilter filtro = SpellFilter.builder()
                .circuloMinimo(2)
                .build();

        List<Magia> resultado = service.buscar(filtro);

        for (Magia magia : resultado){
            System.out.println(magia.getNome());
        }

    }
}
