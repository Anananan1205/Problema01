package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.Scanner;

public class ComandoCadastrarAcao implements Comando {
    private final Scanner scanner;
    private final BolsaDeValores bolsa;

    public ComandoCadastrarAcao(Scanner scanner, BolsaDeValores bolsa) {
        this.scanner = scanner;
        this.bolsa = bolsa;
    }

    @Override
    public void executar() {
        System.out.print("Codigo da Acao (ex: VALE3): ");
        Nome nome = new Nome(this.scanner.nextLine());
        
        System.out.print("Preco inicial (ex: 60.00): ");
        Preco preco = new Preco(this.scanner.nextLine());
        
        this.bolsa.cadastrarAcao(new Acao(nome, preco));
    }
}