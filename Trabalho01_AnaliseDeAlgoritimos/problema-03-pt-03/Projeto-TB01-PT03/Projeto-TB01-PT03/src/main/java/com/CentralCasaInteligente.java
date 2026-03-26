package com;

import java.util.List;

public class CentralCasaInteligente {
    private final List<Lampada> luzes;
    private final List<Persiana> persianas;
    private final List<ArCondicionado> aresCondicionados;

    public CentralCasaInteligente(List<Lampada> luzes, List<Persiana> persianas, List<ArCondicionado> ares) {
        this.luzes = luzes;
        this.persianas = persianas;
        this.aresCondicionados = ares;
    }

    public void ativarModoSono() {
        this.aresCondicionados.forEach(ArCondicionado::desligar);
        this.luzes.forEach(Lampada::desligar);
        this.persianas.forEach(Persiana::fechar);
    }

    public void ativarModoTrabalho() {
        this.luzes.forEach(Lampada::ligar);
        this.persianas.forEach(Persiana::abrir);
        this.aresCondicionados.forEach(ar -> {
            ar.ligar();
            ar.definirTemperatura(new Temperatura(25));
        });
    }
}