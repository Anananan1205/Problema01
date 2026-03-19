package com.trabalhofinal.bolsadevalorestb1pt2;

public class ComandoSair implements Comando {
    private final StatusApp status;

    public ComandoSair(StatusApp status) {
        this.status = status;
    }

    @Override
    public void executar() {
        System.out.println("Encerrando o Simulador B3...");
        this.status.desligar();
    }
}