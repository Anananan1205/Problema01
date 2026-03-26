package com;

public class Temperatura {
    private final int valor;

    public Temperatura(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public boolean isMenorQue(Temperatura outra) {
        return this.valor < outra.valor;
    }

    public boolean isMaiorQue(Temperatura outra) {
        return this.valor > outra.valor;
    }
}