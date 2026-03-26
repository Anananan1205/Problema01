package com;

import br.furb.analise.algoritmos.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LampadaShoyuMi shoyuMi = new LampadaShoyuMi();
        LampadaPhellipes phellipes = new LampadaPhellipes();
        PersianaNatLight natLight = new PersianaNatLight();
        PersianaSolarius solarius = new PersianaSolarius();
        ArCondicionadoVentoBaumn ventoBaumn = new ArCondicionadoVentoBaumn();
        ArCondicionadoGellaKaza gellaKaza = new ArCondicionadoGellaKaza();

        Lampada luzSala = new AdaptadorLampadaShoyuMi(shoyuMi);
        Lampada luzQuarto = new AdaptadorLampadaPhellipes(phellipes);
        Persiana persianaSala = new AdaptadorPersianaNatLight(natLight);
        Persiana persianaQuarto = new AdaptadorPersianaSolarius(solarius);
        ArCondicionado arSala = new AdaptadorArVentoBaumn(ventoBaumn);
        ArCondicionado arQuarto = new AdaptadorArGellaKaza(gellaKaza);

        CentralCasaInteligente central = new CentralCasaInteligente(
                Arrays.asList(luzSala, luzQuarto),
                Arrays.asList(persianaSala, persianaQuarto),
                Arrays.asList(arSala, arQuarto)
        );

        MenuInterativo menu = new MenuInterativo(central, arSala, arQuarto, persianaSala, persianaQuarto, luzSala, luzQuarto);
        menu.iniciar();
    }
}