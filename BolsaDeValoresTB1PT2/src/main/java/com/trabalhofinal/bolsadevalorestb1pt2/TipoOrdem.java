package com.trabalhofinal.bolsadevalorestb1pt2;

public enum TipoOrdem {
    COMPRA, VENDA;

    public boolean isCompra() {
        return this == COMPRA;
    }
}