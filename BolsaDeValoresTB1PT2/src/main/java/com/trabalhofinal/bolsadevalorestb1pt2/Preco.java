package com.trabalhofinal.bolsadevalorestb1pt2;

import java.math.BigDecimal;

public class Preco {
    private final BigDecimal valor;

    public Preco(String valor) {
        this.valor = new BigDecimal(valor);
    }

    public boolean isIgual(Preco outro) {
        return this.valor.compareTo(outro.valor) == 0;
    }

    public void imprimir() {
        System.out.print("R$ " + this.valor);
    }
}