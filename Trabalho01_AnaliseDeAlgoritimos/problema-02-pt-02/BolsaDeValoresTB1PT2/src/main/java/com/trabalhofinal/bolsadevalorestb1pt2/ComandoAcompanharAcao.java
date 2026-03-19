package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.Optional;

public class ComandoAcompanharAcao implements Comando {
    private final Seletor seletor;

    public ComandoAcompanharAcao(Seletor seletor) {
        this.seletor = seletor;
    }

    @Override
    public void executar() {
        Optional<Investidor> inv = this.seletor.investidor();
        if (inv.isEmpty()) return;

        Optional<Acao> acao = this.seletor.acao();
        if (acao.isEmpty()) return;

        inv.get().acompanharAcao(acao.get());
    }
}