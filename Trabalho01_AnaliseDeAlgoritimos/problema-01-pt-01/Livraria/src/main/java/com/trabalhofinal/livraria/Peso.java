package com.trabalhofinal.livraria;

public class Peso {

    private final float valor;

    public Peso(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O peso não pode ser negativo!");
        }
        this.valor = valor;
    }

    public boolean naoUltrapassa(float limite) {
        return this.valor <= limite;
    }

    public Peso somar(Peso outroPeso) {
        return new Peso(this.valor + outroPeso.valor);
    }

    public int obterFracoesDe100gAcimaDe(float limite) {
        if (naoUltrapassa(limite)) {
            return 0;
        }

        float pesoExcedente = this.valor - limite;

        return (int) Math.ceil(pesoExcedente * 10f);
    }

    @Override
    public String toString() {
        return String.format("%.3f kg", valor);
    }
}
