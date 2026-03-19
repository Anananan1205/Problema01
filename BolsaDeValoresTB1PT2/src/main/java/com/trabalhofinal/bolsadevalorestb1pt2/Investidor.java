package com.trabalhofinal.bolsadevalorestb1pt2;

public class Investidor implements Observer {
    private final Nome nome;
    private final ListaDeGatilhos gatilhos = new ListaDeGatilhos();

    public Investidor(Nome nome) {
        this.nome = nome;
    }

    public void boletar(Acao acao, TipoOrdem tipo, Preco valor) {
        Ordem nova = new Ordem(this.nome, tipo, valor);
        acao.lancarOrdem(nova);
    }

    public void agendarGatilho(Acao acao, Preco precoAlvo, TipoOrdem tipo, Preco valorOrdem) {
        Ordem ordem = new Ordem(this.nome, tipo, valorOrdem);
        Gatilho gatilho = new Gatilho(acao, precoAlvo, ordem);
        this.gatilhos.add(gatilho);
        acao.inscrever(this); 
    }

    public void acompanharAcao(Acao acao) {
        acao.inscrever(this);
        System.out.print("[App] ");
        this.nome.imprimir();
        System.out.println(" começou a acompanhar a ação.");
    }

    @Override
    public void aoAtualizarPreco(Nome acao, Preco novoPreco) {
        System.out.print("[App Notificação] ");
        this.nome.imprimir();
        System.out.print(": A ação ");
        acao.imprimir();
        System.out.println(" teve o preço alterado!");
        
        this.gatilhos.verificarTodos(acao, novoPreco);
    }

    public boolean isIgual(Nome outroNome) {
        return this.nome.isIgual(outroNome);
    }

    public void imprimirNome() {
        this.nome.imprimir();
    }
}