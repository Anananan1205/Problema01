package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.Optional;
import java.util.Scanner;

public class ComandoProgramarGatilho implements Comando {
    private final Scanner scanner;
    private final Seletor seletor;

    public ComandoProgramarGatilho(Scanner scanner, Seletor seletor) {
        this.scanner = scanner;
        this.seletor = seletor;
    }

    @Override
    public void executar() {
        Optional<Investidor> inv = this.seletor.investidor();
        if (inv.isEmpty()) return;

        Optional<Acao> acao = this.seletor.acao();
        if (acao.isEmpty()) return;

        System.out.print("Preco ALVO (ex: 25.00): ");
        Preco precoAlvo = new Preco(this.scanner.nextLine());

        System.out.print("Tipo disparado (C/V): ");
        TipoOrdem tipo = converterTipo(this.scanner.nextLine());

        System.out.print("Valor da ordem disparada (ex: 24.50): ");
        Preco precoOrdem = new Preco(this.scanner.nextLine());

        inv.get().agendarGatilho(acao.get(), precoAlvo, tipo, precoOrdem);
        System.out.println("[Sistema] Gatilho programado!");
    }

    private TipoOrdem converterTipo(String letra) {
        if (letra.equalsIgnoreCase("V")) return TipoOrdem.VENDA;
        return TipoOrdem.COMPRA;
    }
}