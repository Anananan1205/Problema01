package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BolsaDeValores {
    private final List<Acao> acoesDisponiveis = new ArrayList<>();
    private final List<Investidor> investidoresCadastrados = new ArrayList<>();

    public void cadastrarAcao(Acao acao) {
        this.acoesDisponiveis.add(acao);
        System.out.println("[Bolsa] Ação cadastrada com sucesso!");
    }

    public void cadastrarInvestidor(Investidor investidor) {
        this.investidoresCadastrados.add(investidor);
        System.out.println("[Bolsa] Investidor cadastrado com sucesso!");
    }

    public void listarAcoes() {
        for (int i = 0; i < this.acoesDisponiveis.size(); i++) {
            System.out.print("[" + i + "] ");
            this.acoesDisponiveis.get(i).imprimirNome();
            System.out.println();
        }
    }

    public void listarInvestidores() {
        for (int i = 0; i < this.investidoresCadastrados.size(); i++) {
            System.out.print("[" + i + "] ");
            this.investidoresCadastrados.get(i).imprimirNome();
            System.out.println();
        }
    }

    public Optional<Acao> escolherAcao(int indice) {
        if (indice >= 0 && indice < this.acoesDisponiveis.size()) {
            return Optional.of(this.acoesDisponiveis.get(indice));
        }
        return Optional.empty();
    }

    public Optional<Investidor> escolherInvestidor(int indice) {
        if (indice >= 0 && indice < this.investidoresCadastrados.size()) {
            return Optional.of(this.investidoresCadastrados.get(indice));
        }
        return Optional.empty();
    }
    
    public Optional<Acao> buscarAcao(Nome nomeAcao) {
        for (Acao acao : this.acoesDisponiveis) {
            if (acao.isIgual(nomeAcao)) {
                return Optional.of(acao);
            }
        }
        return Optional.empty();
    }

    public Optional<Investidor> buscarInvestidor(Nome nomeInvestidor) {
        for (Investidor investidor : this.investidoresCadastrados) {
            if (investidor.isIgual(nomeInvestidor)) {
                return Optional.of(investidor);
            }
        }
        return Optional.empty();
    }
}