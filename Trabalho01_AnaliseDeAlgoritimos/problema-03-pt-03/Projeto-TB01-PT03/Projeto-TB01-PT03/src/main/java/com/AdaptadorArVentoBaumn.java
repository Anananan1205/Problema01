package com;

import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;

public class AdaptadorArVentoBaumn implements ArCondicionado {
    private final ArCondicionadoVentoBaumn ar;
    private boolean estadoLigado = false;

    public AdaptadorArVentoBaumn(ArCondicionadoVentoBaumn ar) {
        this.ar = ar;
    }

    @Override
    public void ligar() {
        this.ar.ligar();
        this.estadoLigado = true;
    }

    @Override
    public void desligar() {
        this.ar.desligar();
        this.estadoLigado = false;
    }

    @Override
    public void aumentarTemperatura() {
        this.ar.definirTemperatura(this.ar.getTemperatura() + 1);
    }

    @Override
    public void diminuirTemperatura() {
        this.ar.definirTemperatura(this.ar.getTemperatura() - 1);
    }

    @Override
    public void definirTemperatura(Temperatura temperatura) {
        this.ar.definirTemperatura(temperatura.getValor());
    }

    @Override
    public boolean isLigado() {
        return this.estadoLigado;
    }

    @Override
    public Temperatura getTemperatura() {
        return new Temperatura(this.ar.getTemperatura());
    }
}