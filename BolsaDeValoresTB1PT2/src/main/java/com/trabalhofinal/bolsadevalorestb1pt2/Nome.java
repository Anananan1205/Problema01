package com.trabalhofinal.bolsadevalorestb1pt2;

public class Nome {
    private final String texto;

    public Nome(String texto) {
        this.texto = texto;
    }

    public boolean isIgual(Nome outro) {
        return this.texto.equals(outro.texto);
    }

    public void imprimir() {
        System.out.print(this.texto);
    }
}