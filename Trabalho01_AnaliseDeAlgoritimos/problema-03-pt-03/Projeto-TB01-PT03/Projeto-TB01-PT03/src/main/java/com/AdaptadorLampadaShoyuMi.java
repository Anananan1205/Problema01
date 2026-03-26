package com;

import br.furb.analise.algoritmos.LampadaShoyuMi;

public class AdaptadorLampadaShoyuMi implements Lampada {
    private final LampadaShoyuMi lampada;
    private boolean estadoLigada = false;

    public AdaptadorLampadaShoyuMi(LampadaShoyuMi lampada) {
        this.lampada = lampada;
    }

    @Override
    public void ligar() {
        this.lampada.ligar();
        this.estadoLigada = true;
    }

    @Override
    public void desligar() {
        this.lampada.desligar();
        this.estadoLigada = false;
    }

    @Override
    public boolean isLigada() {
        return this.estadoLigada;
    }
}