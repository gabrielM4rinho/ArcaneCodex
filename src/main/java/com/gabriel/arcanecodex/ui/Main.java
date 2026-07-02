package com.gabriel.arcanecodex.ui;

import com.gabriel.arcanecodex.model.SpellCatalog;
import com.gabriel.arcanecodex.model.Magia;
import com.gabriel.arcanecodex.repository.MagiaRepository;

public class Main {
    public static void main(String[] args) {

        MagiaRepository repository = new MagiaRepository();

        SpellCatalog catalog = repository.carregarMagias();

        System.out.println("Versão: " + catalog.getVersao());
        System.out.println("Quantidade de magias: " + catalog.getMagias().size());

        for (Magia magia : catalog.getMagias()) {

            System.out.println("------------------------");
            System.out.println("ID: " + magia.getId());
            System.out.println("Nome: " + magia.getNome());
            System.out.println("Círculo: " + magia.getCirculo());
            System.out.println("Escola: " + magia.getEscola());
            System.out.println("Execução: " + magia.getExecucao());
            System.out.println("Tags: " + magia.getTags());

        }

    }
}
