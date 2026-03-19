package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.Optional;
import java.util.Scanner;

public class Seletor {
    private final Scanner scanner;
    private final BolsaDeValores bolsa;

    public Seletor(Scanner scanner, BolsaDeValores bolsa) {
        this.scanner = scanner;
        this.bolsa = bolsa;
    }

    public Optional<Investidor> investidor() {
        this.bolsa.listarInvestidores();
        System.out.print("Numero do Investidor: ");
        return parseInvestidor(this.scanner.nextLine());
    }

    private Optional<Investidor> parseInvestidor(String entrada) {
        try {
            return this.bolsa.escolherInvestidor(Integer.parseInt(entrada));
        } catch (NumberFormatException e) {
            System.out.println("[Erro] Digite um numero valido!");
            return Optional.empty();
        }
    }

    public Optional<Acao> acao() {
        this.bolsa.listarAcoes();
        System.out.print("Numero da Acao: ");
        return parseAcao(this.scanner.nextLine());
    }

    private Optional<Acao> parseAcao(String entrada) {
        try {
            return this.bolsa.escolherAcao(Integer.parseInt(entrada));
        } catch (NumberFormatException e) {
            System.out.println("[Erro] Digite um numero valido!");
            return Optional.empty();
        }
    }
}