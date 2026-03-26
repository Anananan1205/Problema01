package com;

import br.furb.analise.algoritmos.LampadaPhellipes;

public class AdaptadorLampadaPhellipes implements Lampada {
    private final LampadaPhellipes lampada;

    public AdaptadorLampadaPhellipes(LampadaPhellipes lampada) {
        this.lampada = lampada;
    }

    @Override
    public void ligar() {
        this.lampada.setIntensidade(100);
    }

    @Override
    public void desligar() {
        this.lampada.setIntensidade(0);
    }


    @Override
    public boolean isLigada() {
        return this.lampada.getIntensidade() > 0;
    }
}