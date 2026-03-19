package com.trabalhofinal.bolsadevalorestb1pt2;

import java.util.Optional;

public class LivroDeOfertas {
    private final FilaDeOrdens compras = new FilaDeOrdens();
    private final FilaDeOrdens vendas = new FilaDeOrdens();

    public Optional<Preco> processar(Ordem ordem) {
        if (ordem.isCompra()) {
            return fecharNegocio(ordem, vendas, compras);
        }
        return fecharNegocio(ordem, compras, vendas); 
    }

    private Optional<Preco> fecharNegocio(Ordem ordem, FilaDeOrdens opostas, FilaDeOrdens mesmoTipo) {
        Optional<Ordem> match = opostas.buscarMatch(ordem);
        if (match.isPresent()) {
            opostas.remover(match.get());
            return Optional.of(ordem.getPrecoOriginal());
        }
        mesmoTipo.add(ordem);
        return Optional.empty();
    }
}