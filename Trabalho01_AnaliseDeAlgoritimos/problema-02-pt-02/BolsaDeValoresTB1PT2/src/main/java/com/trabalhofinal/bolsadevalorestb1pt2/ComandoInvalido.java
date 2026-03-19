package com.trabalhofinal.bolsadevalorestb1pt2;

public class ComandoInvalido implements Comando {
    @Override
    public void executar() {
        System.out.println("[Erro] Opcao invalida!");
    }
}