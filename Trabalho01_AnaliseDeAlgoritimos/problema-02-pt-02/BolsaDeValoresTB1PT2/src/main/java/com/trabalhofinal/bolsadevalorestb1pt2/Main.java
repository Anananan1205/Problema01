package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BolsaDeValores bolsa = new BolsaDeValores();
        StatusApp status = new StatusApp();
        Seletor seletor = new Seletor(scanner, bolsa);

        bolsa.cadastrarAcao(new Acao(new Nome("BBAS3"), new Preco("24.00")));
        bolsa.cadastrarAcao(new Acao(new Nome("PETR4"), new Preco("36.50")));
        bolsa.cadastrarInvestidor(new Investidor(new Nome("Mariana")));
        bolsa.cadastrarInvestidor(new Investidor(new Nome("Joaquim")));

        Menu menu = new Menu(scanner, status);
        menu.registrar("1", new ComandoCadastrarAcao(scanner, bolsa));
        menu.registrar("2", new ComandoCadastrarInvestidor(scanner, bolsa));
        menu.registrar("3", new ComandoAcompanharAcao(seletor));
        menu.registrar("4", new ComandoLancarOrdem(scanner, seletor));
        menu.registrar("5", new ComandoProgramarGatilho(scanner, seletor));
        menu.registrar("6", new ComandoSair(status));

        while (status.isAtivo()) {
            menu.exibirEExecutar();
        }
        scanner.close();
    }
}