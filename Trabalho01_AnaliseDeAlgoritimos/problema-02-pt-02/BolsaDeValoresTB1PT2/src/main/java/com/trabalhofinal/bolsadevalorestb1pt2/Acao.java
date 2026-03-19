package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.Optional;

public class Acao {
    private final Nome nome;
    private Preco precoAtual;
    private final LivroDeOfertas livro = new LivroDeOfertas();
    private final Inscritos inscritos = new Inscritos();

    public Acao(Nome nome, Preco precoInicial) {
        this.nome = nome;
        this.precoAtual = precoInicial;
    }

    public void inscrever(Observer observer) {
        this.inscritos.inscrever(observer);
    }

    public void lancarOrdem(Ordem ordem) {
        Optional<Preco> precoFechado = this.livro.processar(ordem);
        precoFechado.ifPresent(this::atualizarPreco);
    }

    private void atualizarPreco(Preco novoPreco) {
        this.precoAtual = novoPreco;
        System.out.print("[B3] Negócio fechado! ");
        this.nome.imprimir();
        System.out.print(" agora vale ");
        this.precoAtual.imprimir();
        System.out.println();

        this.inscritos.notificarTodos(this.nome, this.precoAtual);
    }

    public boolean isIgual(Nome outroNome) {
        return this.nome.isIgual(outroNome);
    }

    public void imprimirNome() {
        this.nome.imprimir();
    }
}