package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.Scanner;

public class ComandoCadastrarInvestidor implements Comando {
    private final Scanner scanner;
    private final BolsaDeValores bolsa;

    public ComandoCadastrarInvestidor(Scanner scanner, BolsaDeValores bolsa) {
        this.scanner = scanner;
        this.bolsa = bolsa;
    }

    @Override
    public void executar() {
        System.out.print("Nome do Investidor: ");
        Nome nome = new Nome(this.scanner.nextLine());
        this.bolsa.cadastrarInvestidor(new Investidor(nome));
    }
}