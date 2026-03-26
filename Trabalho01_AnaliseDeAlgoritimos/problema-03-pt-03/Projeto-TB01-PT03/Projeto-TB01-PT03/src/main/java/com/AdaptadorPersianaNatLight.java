package com;

import br.furb.analise.algoritmos.PersianaNatLight;

public class AdaptadorPersianaNatLight implements Persiana {
    private final PersianaNatLight persiana;

    public AdaptadorPersianaNatLight(PersianaNatLight persiana) {
        this.persiana = persiana;
    }

    @Override
    public void abrir() {
        try {
            this.persiana.abrirPalheta();
            this.persiana.subirPalheta();
        } catch (Exception e) {
            System.out.println("Erro ao abrir a persiana: " + e.getMessage());
        }
    }

    @Override
    public void fechar() {
        try {
            this.persiana.descerPalheta();
            this.persiana.fecharPalheta();
        } catch (Exception e) {
            System.out.println("Erro ao fechar a persiana: " + e.getMessage());
        }
    }

    @Override
    public boolean isAberta() {
        return this.persiana.estaPalhetaErguida();
    }
}