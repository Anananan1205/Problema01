package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.ArrayList;
import java.util.List;

public class Inscritos {
    private final List<Observer> lista = new ArrayList<>();

    public void inscrever(Observer observer) {
        this.lista.add(observer);
    }

    public void notificarTodos(Nome acao, Preco novoPreco) {
        for (Observer obs : this.lista) {
            obs.aoAtualizarPreco(acao, novoPreco);
        }
    }
}