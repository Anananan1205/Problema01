package com;

public class OpcaoMenu {
    private final String valor;

    public OpcaoMenu(String valor) {
        this.valor = valor;
    }

    public boolean isIgual(String outraOpcao) {
        return this.valor.equals(outraOpcao);
    }

    public int paraInteiro() {
        return Integer.parseInt(this.valor);
    }
}