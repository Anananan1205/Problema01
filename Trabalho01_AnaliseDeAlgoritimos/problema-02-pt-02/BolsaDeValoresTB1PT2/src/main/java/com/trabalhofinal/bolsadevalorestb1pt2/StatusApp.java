package com.trabalhofinal.bolsadevalorestb1pt2;

public class StatusApp {
    private boolean ativo = true;

    public void desligar() {
        this.ativo = false;
    }

    public boolean isAtivo() {
        return this.ativo;
    }
}