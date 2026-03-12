package com.trabalhofinal.livraria;

public class Dinheiro {

    private final float quantia;

    public Dinheiro(float quantia) {
        if (quantia < 0) {
            throw new IllegalArgumentException("O valor do livro não pode ser negativo!");
        }
        this.quantia = quantia;
    }

    public Dinheiro somar(Dinheiro outroValor) {
        return new Dinheiro(this.quantia + outroValor.quantia);
    }

    @Override
    public String toString() {
        return String.format("R$ %.2f", quantia);
    }
}
