package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.ArrayList;
import java.util.List;

public class ListaDeGatilhos {
    private final List<Gatilho> gatilhos = new ArrayList<>();

    public void add(Gatilho gatilho) {
        this.gatilhos.add(gatilho);
    }

    public void verificarTodos(Nome acao, Preco novoPreco) {
        List<Gatilho> naoDisparados = new ArrayList<>();
        
        for (Gatilho g : this.gatilhos) {
            boolean disparou = g.checar(acao, novoPreco);
            if (!disparou) {
                naoDisparados.add(g);
            }
        }
        
        this.gatilhos.clear();
        this.gatilhos.addAll(naoDisparados);
    }
}