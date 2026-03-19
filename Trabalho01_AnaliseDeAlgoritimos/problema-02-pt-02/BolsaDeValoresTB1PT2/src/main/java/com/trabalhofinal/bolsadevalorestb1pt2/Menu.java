package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Map<String, Comando> opcoes = new HashMap<>();
    private final Scanner scanner;
    private final StatusApp status;

    public Menu(Scanner scanner, StatusApp status) {
        this.scanner = scanner;
        this.status = status;
    }

    public void registrar(String chave, Comando comando) {
        this.opcoes.put(chave, comando);
    }

    public void exibirEExecutar() {
        imprimirOpcoes();
        String escolha = this.scanner.nextLine();
        limparTela();
        
        Comando comando = this.opcoes.getOrDefault(escolha, new ComandoInvalido());
        comando.executar();
        
        pausar();
    }

    private void imprimirOpcoes() {
        limparTela();
        System.out.println("=== SIMULADOR B3 ===");
        System.out.println("[1] Cadastrar Acao");
        System.out.println("[2] Cadastrar Investidor");
        System.out.println("[3] Acompanhar Acao");
        System.out.println("[4] Lancar Ordem");
        System.out.println("[5] Programar Gatilho");
        System.out.println("[6] Sair");
        System.out.print("Escolha: ");
    }

    private void limparTela() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    private void pausar() {
        if (this.status.isAtivo()) {
            System.out.println("\nPressione ENTER para continuar...");
            this.scanner.nextLine();
        }
    }
}