package com.trabalhofinal.bolsadevalorestb1pt2;

public class Gatilho {
    private final Acao acao;
    private final Preco precoAlvo;
    private final Ordem ordemPendente;

    public Gatilho(Acao acao, Preco precoAlvo, Ordem ordemPendente) {
        this.acao = acao;
        this.precoAlvo = precoAlvo;
        this.ordemPendente = ordemPendente;
    }

    public boolean checar(Nome acaoNotificada, Preco precoAtual) {
        if (this.acao.isIgual(acaoNotificada)) {
            return dispararSeAtingiu(precoAtual);
        }
        return false;
    }

    private boolean dispararSeAtingiu(Preco precoAtual) {
        if (this.precoAlvo.isIgual(precoAtual)) {
            System.out.println("[Gatilho] Preço atingido! Disparando ordem automática...");
            this.acao.lancarOrdem(this.ordemPendente);
            return true;
        }
        return false;
    }
}