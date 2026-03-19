package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.Optional;
import java.util.Scanner;

public class ComandoLancarOrdem implements Comando {
    private final Scanner scanner;
    private final Seletor seletor;

    public ComandoLancarOrdem(Scanner scanner, Seletor seletor) {
        this.scanner = scanner;
        this.seletor = seletor;
    }

    @Override
    public void executar() {
        Optional<Investidor> inv = this.seletor.investidor();
        if (inv.isEmpty()) return;

        Optional<Acao> acao = this.seletor.acao();
        if (acao.isEmpty()) return;

        System.out.print("Tipo (C/V): ");
        TipoOrdem tipo = converterTipo(this.scanner.nextLine());

        System.out.print("Preco (ex: 24.00): ");
        Preco preco = new Preco(this.scanner.nextLine());

        inv.get().boletar(acao.get(), tipo, preco);
        System.out.println("[Sistema] Ordem registrada!");
    }

    private TipoOrdem converterTipo(String letra) {
        if (letra.equalsIgnoreCase("V")) return TipoOrdem.VENDA;
        return TipoOrdem.COMPRA;
    }
}