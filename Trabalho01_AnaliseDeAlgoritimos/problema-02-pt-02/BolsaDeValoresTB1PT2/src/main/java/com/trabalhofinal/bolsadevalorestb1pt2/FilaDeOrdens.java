package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilaDeOrdens {
    private final List<Ordem> ordens = new ArrayList<>();

    public void add(Ordem ordem) {
        this.ordens.add(ordem);
    }

    public void remover(Ordem ordem) {
        this.ordens.remove(ordem);
    }

    public Optional<Ordem> buscarMatch(Ordem nova) {
        for (Ordem o : this.ordens) {
            if (o.temMesmoPreco(nova)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}