package com.gabriel.arcanecodex.service;

import com.gabriel.arcanecodex.filter.SpellFilter;
import com.gabriel.arcanecodex.model.Magia;

public class SpellMatcher {

    private SpellMatcher(){}

    public static boolean matches(Magia magia, SpellFilter filtro) {

        if (filtro.getCirculoMaximo() != null) {

            if (magia.getCirculo() > filtro.getCirculoMaximo()) {
                return false;
            }

        }

        if (filtro.getCirculoMinimo() != null) {

            if (magia.getCirculo() < filtro.getCirculoMinimo()) {
                return false;
            }

        }
        return true;
    }

}
