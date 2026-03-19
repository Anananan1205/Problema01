package com.trabalhofinal.bolsadevalorestb1pt2;

public class Ordem {
    private final Nome investidor;
    private final TipoOrdem tipo;
    private final Preco preco;

    public Ordem(Nome investidor, TipoOrdem tipo, Preco preco) {
        this.investidor = investidor;
        this.tipo = tipo;
        this.preco = preco;
    }

    public boolean isCompra() {
        return this.tipo.isCompra();
    }

    public boolean temMesmoPreco(Ordem outra) {
        return this.preco.isIgual(outra.preco);
    }

    public Preco getPrecoOriginal() {
        return this.preco;
    }
}