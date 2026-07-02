package com.gabriel.arcanecodex.service;

import com.gabriel.arcanecodex.filter.SpellFilter;
import com.gabriel.arcanecodex.model.Magia;

public class SpellMatcher {

    private SpellMatcher(){}

    public static boolean matches(Magia magia, SpellFilter filtro) {

        // Circulo Maximo
        if (filtro.getCirculoMaximo() != null) {

            if (magia.getCirculo() > filtro.getCirculoMaximo()) {
                return false;
            }
        }

        // Circulo Minimo
        if (filtro.getCirculoMinimo() != null) {

            if (magia.getCirculo() < filtro.getCirculoMinimo()) {
                return false;
            }
        }

        // escola

        if (filtro.getEscola() != null) {

            if (magia.getEscola() != filtro.getEscola()) {
                return false;
            }
        }

        // execução

        if (filtro.getExecucao() != null) {

            if (magia.getExecucao() != filtro.getExecucao()) {
                return false;
            }
        }
        // alcance

            if(filtro.getAlcance() != null){
                if(magia.getAlcance() != filtro.getAlcance()){
                    return false;
            }
        }

        // resistência

        if(filtro.getResistencia() != null){
            if(magia.getResistencia() != filtro.getResistencia()){
                return false;
            }
        }

        // nome

        if(filtro.getNome() != null){
            if(!magia.getNome().equalsIgnoreCase(filtro.getNome())){
                return false;
            }
        }

        // texto

        if(filtro.getTexto() != null){
            if(!magia.getDescricao().toLowerCase().contains(filtro.getTexto().toLowerCase())){
                return false;
            }
        }

        // tags

        if(filtro.getTags() != null && filtro.getTags().isEmpty()){
            if(!magia.getTags().containsAll(filtro.getTags())){
                return false;
            }
        }
        return true;
    }



}
