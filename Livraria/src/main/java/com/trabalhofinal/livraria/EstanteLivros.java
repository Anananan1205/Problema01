package com.trabalhofinal.livraria;

import java.util.ArrayList;

public class EstanteLivros {

    private static final ArrayList<Livro> estante = new ArrayList<>();

    public static void adicionarLivro(Livro novoLivro) {
        estante.add(novoLivro);
    }

    // Tell, Don't Ask: A própria estante devolve os objetos já calculados
    public static Dinheiro calcularValorTotal() {
        Dinheiro total = new Dinheiro(0f);
        for (Livro livro : estante) {
            total = total.somar(livro.getValorLivro());
        }
        return total;
    }

    public static Peso calcularPesoTotal() {
        Peso total = new Peso(0f);
        for (Livro livro : estante) {
            total = total.somar(livro.getPesoLivro());
        }
        return total;
    }

    public static ArrayList<Livro> getTodosOsLivros() {
        return estante;
    }

    public static void limparEstante() {
        estante.clear();
    }

}
