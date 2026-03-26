package com;

import br.furb.analise.algoritmos.PersianaSolarius;

public class AdaptadorPersianaSolarius implements Persiana {
    private final PersianaSolarius persiana;

    public AdaptadorPersianaSolarius(PersianaSolarius persiana) {
        this.persiana = persiana;
    }

    @Override
    public void abrir() {
        this.persiana.subirPersiana();
    }

    @Override
    public void fechar() {
        this.persiana.descerPersiana();
    }

    @Override
    public boolean isAberta() {
        return this.persiana.estaAberta();
    }
}