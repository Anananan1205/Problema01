package com;

import java.util.Scanner;

public class MenuInterativo {
    private final Scanner scanner;
    private final CentralCasaInteligente central;
    private final ArCondicionado arSala;
    private final ArCondicionado arQuarto;
    private final Persiana persianaSala;
    private final Persiana persianaQuarto;
    private final Lampada luzSala;
    private final Lampada luzQuarto;
    private boolean executando;

    public MenuInterativo(CentralCasaInteligente central, ArCondicionado arSala, ArCondicionado arQuarto, Persiana persianaSala, Persiana persianaQuarto, Lampada luzSala, Lampada luzQuarto) {
        this.scanner = new Scanner(System.in);
        this.central = central;
        this.arSala = arSala;
        this.arQuarto = arQuarto;
        this.persianaSala = persianaSala;
        this.persianaQuarto = persianaQuarto;
        this.luzSala = luzSala;
        this.luzQuarto = luzQuarto;
        this.executando = true;
    }

    public void iniciar() {
        while (this.executando) {
            exibirStatusCasa();
            exibirMenuPrincipal();
            processarEscolhaPrincipal(lerOpcao());
        }
    }

    private OpcaoMenu lerOpcao() {
        return new OpcaoMenu(this.scanner.nextLine());
    }

    private void exibirStatusCasa() {
        System.out.println("\n========== STATUS GERAL DA CASA ==========");
        System.out.println("Ar Sala (VentoBaumn)....: " + (this.arSala.isLigado() ? "LIGADO (" + this.arSala.getTemperatura().getValor() + "°C)" : "DESLIGADO"));
        System.out.println("Ar Quarto (GellaKaza)...: " + (this.arQuarto.isLigado() ? "LIGADO (" + this.arQuarto.getTemperatura().getValor() + "°C)" : "DESLIGADO"));
        System.out.println("Persiana Sala (NatLight): " + (this.persianaSala.isAberta() ? "ABERTA" : "FECHADA"));
        System.out.println("Persiana Quarto (Solar).: " + (this.persianaQuarto.isAberta() ? "ABERTA" : "FECHADA"));
        System.out.println("Lâmpada Sala (ShoyuMi)..: " + (this.luzSala.isLigada() ? "LIGADA" : "DESLIGADA"));
        System.out.println("Lâmpada Quarto (Phell)..: " + (this.luzQuarto.isLigada() ? "LIGADA" : "DESLIGADA"));
        System.out.println("==========================================");
    }

    private void exibirMenuPrincipal() {
        System.out.println("1 - Controlar Ar Sala");
        System.out.println("2 - Controlar Ar Quarto");
        System.out.println("3 - Controlar Persiana Sala");
        System.out.println("4 - Controlar Persiana Quarto");
        System.out.println("5 - Controlar Lâmpada Sala");
        System.out.println("6 - Controlar Lâmpada Quarto");
        System.out.println("7 - Modos Inteligentes (Sono / Trabalho)");
        System.out.println("8 - Sair");
        System.out.print("Escolha: ");
    }

    private void processarEscolhaPrincipal(OpcaoMenu escolha) {
        if (escolha.isIgual("1")) loopMenuAr(this.arSala, "AR SALA");
        if (escolha.isIgual("2")) loopMenuAr(this.arQuarto, "AR QUARTO");
        if (escolha.isIgual("3")) loopMenuPersiana(this.persianaSala, "PERSIANA SALA");
        if (escolha.isIgual("4")) loopMenuPersiana(this.persianaQuarto, "PERSIANA QUARTO");
        if (escolha.isIgual("5")) loopMenuLampada(this.luzSala, "LÂMPADA SALA");
        if (escolha.isIgual("6")) loopMenuLampada(this.luzQuarto, "LÂMPADA QUARTO");
        if (escolha.isIgual("7")) loopMenuModos();
        if (escolha.isIgual("8")) this.executando = false;
    }

    private void loopMenuAr(ArCondicionado ar, String nome) {
        boolean noSubmenu = true;
        while (noSubmenu) {
            System.out.println("\n[STATUS " + nome + "] " + (ar.isLigado() ? "LIGADO (" + ar.getTemperatura().getValor() + "°C)" : "DESLIGADO"));
            System.out.println("[" + nome + "] 1-Ligar | 2-Desligar | 3-Aumentar Temp | 4-Diminuir Temp | 5-Definir Temp | 6-Voltar");
            System.out.print("Ação: ");
            noSubmenu = processarEscolhaAr(lerOpcao(), ar);
        }
    }

    private boolean processarEscolhaAr(OpcaoMenu escolha, ArCondicionado ar) {
        if (escolha.isIgual("1")) ar.ligar();
        if (escolha.isIgual("2")) ar.desligar();
        if (escolha.isIgual("3")) ar.aumentarTemperatura();
        if (escolha.isIgual("4")) ar.diminuirTemperatura();
        if (escolha.isIgual("5")) definirTempManual(ar);
        if (escolha.isIgual("6")) return false;
        return true;
    }

    private void definirTempManual(ArCondicionado ar) {
        System.out.print("Digite a temperatura desejada: ");
        Temperatura temp = new Temperatura(lerOpcao().paraInteiro());
        ar.definirTemperatura(temp);
    }

    private void loopMenuPersiana(Persiana persiana, String nome) {
        boolean noSubmenu = true;
        while (noSubmenu) {
            System.out.println("\n[STATUS " + nome + "] " + (persiana.isAberta() ? "ABERTA" : "FECHADA"));
            System.out.println("[" + nome + "] 1-Abrir | 2-Fechar | 3-Voltar");
            System.out.print("Ação: ");
            noSubmenu = processarEscolhaPersiana(lerOpcao(), persiana);
        }
    }

    private boolean processarEscolhaPersiana(OpcaoMenu escolha, Persiana persiana) {
        if (escolha.isIgual("1")) persiana.abrir();
        if (escolha.isIgual("2")) persiana.fechar();
        if (escolha.isIgual("3")) return false;
        return true;
    }

    private void loopMenuLampada(Lampada lampada, String nome) {
        boolean noSubmenu = true;
        while (noSubmenu) {
            System.out.println("\n[STATUS " + nome + "] " + (lampada.isLigada() ? "LIGADA" : "DESLIGADA"));
            System.out.println("[" + nome + "] 1-Ligar | 2-Desligar | 3-Voltar");
            System.out.print("Ação: ");
            noSubmenu = processarEscolhaLampada(lerOpcao(), lampada);
        }
    }

    private boolean processarEscolhaLampada(OpcaoMenu escolha, Lampada lampada) {
        if (escolha.isIgual("1")) lampada.ligar();
        if (escolha.isIgual("2")) lampada.desligar();
        if (escolha.isIgual("3")) return false;
        return true;
    }

    private void loopMenuModos() {
        boolean noSubmenu = true;
        while (noSubmenu) {
            System.out.println("\n[MODOS INTELIGENTES] 1-Modo Sono | 2-Modo Trabalho | 3-Voltar");
            System.out.print("Ação: ");
            noSubmenu = processarEscolhaModos(lerOpcao());
        }
    }

    private boolean processarEscolhaModos(OpcaoMenu escolha) {
        if (escolha.isIgual("1")) this.central.ativarModoSono();
        if (escolha.isIgual("2")) this.central.ativarModoTrabalho();
        if (escolha.isIgual("3")) return false;
        return true;
    }
}