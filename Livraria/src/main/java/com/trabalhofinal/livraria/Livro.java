package com.trabalhofinal.livraria;

public class Livro {

    private String nomeLivro;
    private Dinheiro valorLivro; 
    private Peso pesoLivro;      

    public Livro(String nomeLivro, Dinheiro valorLivro, Peso pesoLivro) {
        this.nomeLivro = nomeLivro;
        this.valorLivro = valorLivro;
        this.pesoLivro = pesoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public Dinheiro getValorLivro() {
        return valorLivro;
    }

    public Peso getPesoLivro() {
        return pesoLivro;
    }
}