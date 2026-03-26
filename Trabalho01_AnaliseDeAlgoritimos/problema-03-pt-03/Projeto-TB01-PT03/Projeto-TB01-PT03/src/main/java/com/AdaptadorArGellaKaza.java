package com;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;

public class AdaptadorArGellaKaza implements ArCondicionado {
    private final ArCondicionadoGellaKaza ar;

    public AdaptadorArGellaKaza(ArCondicionadoGellaKaza ar) {
        this.ar = ar;
    }

    @Override public void ligar() { this.ar.ativar(); }
    @Override public void desligar() { this.ar.desativar(); }
    @Override public void aumentarTemperatura() { this.ar.aumentarTemperatura(); }
    @Override public void diminuirTemperatura() { this.ar.diminuirTemperatura(); }
    @Override public void definirTemperatura(Temperatura temperaturaAlvo) { ajustarTemperatura(temperaturaAlvo); }
    @Override public boolean isLigado() { return this.ar.estaLigado(); }
    @Override public Temperatura getTemperatura() { return new Temperatura(this.ar.getTemperatura()); }

    private void ajustarTemperatura(Temperatura alvo) {
        Temperatura atual = getTemperatura();

        if (atual.isMenorQue(alvo)) {
            this.ar.aumentarTemperatura();
            ajustarTemperatura(alvo);
        }

        if (atual.isMaiorQue(alvo)) {
            this.ar.diminuirTemperatura();
            ajustarTemperatura(alvo);
        }
    }
}