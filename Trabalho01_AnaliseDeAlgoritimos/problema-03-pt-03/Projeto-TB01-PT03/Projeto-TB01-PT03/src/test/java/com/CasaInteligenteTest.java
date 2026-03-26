package com;

import br.furb.analise.algoritmos.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class CasaInteligenteTest {

    private Lampada luzPhellipes;
    private Lampada luzShoyuMi;
    private Persiana persianaNatLight;
    private Persiana persianaSolarius;
    private ArCondicionado arGellaKaza;
    private ArCondicionado arVentoBaumn;
    private CentralCasaInteligente central;

    @BeforeEach
    public void setUp() {
        luzPhellipes = new AdaptadorLampadaPhellipes(new LampadaPhellipes());
        luzShoyuMi = new AdaptadorLampadaShoyuMi(new LampadaShoyuMi());
        persianaNatLight = new AdaptadorPersianaNatLight(new PersianaNatLight());
        persianaSolarius = new AdaptadorPersianaSolarius(new PersianaSolarius());
        arGellaKaza = new AdaptadorArGellaKaza(new ArCondicionadoGellaKaza());
        arVentoBaumn = new AdaptadorArVentoBaumn(new ArCondicionadoVentoBaumn());

        central = new CentralCasaInteligente(
                Arrays.asList(luzPhellipes, luzShoyuMi),
                Arrays.asList(persianaNatLight, persianaSolarius),
                Arrays.asList(arGellaKaza, arVentoBaumn)
        );
    }

    @Test
    public void testAdaptadorLampadaPhellipes() {
        luzPhellipes.ligar();
        assertTrue(luzPhellipes.isLigada());

        luzPhellipes.desligar();
        assertFalse(luzPhellipes.isLigada());
    }

    @Test
    public void testAdaptadorLampadaShoyuMiVariavelControle() {
        luzShoyuMi.ligar();
        assertTrue(luzShoyuMi.isLigada());

        luzShoyuMi.desligar();
        assertFalse(luzShoyuMi.isLigada());
    }

    @Test
    public void testAdaptadorPersianaNatLightOrdemPalhetas() {
        persianaNatLight.abrir();
        assertTrue(persianaNatLight.isAberta());

        persianaNatLight.fechar();
        assertFalse(persianaNatLight.isAberta());
    }

    @Test
    public void testAdaptadorPersianaSolarius() {
        persianaSolarius.abrir();
        assertTrue(persianaSolarius.isAberta());
    }

    @Test
    public void testAdaptadorArVentoBaumnLogicaTemperatura() {
        arVentoBaumn.ligar();

        arVentoBaumn.definirTemperatura(new Temperatura(24));
        arVentoBaumn.aumentarTemperatura();
        assertEquals(25, arVentoBaumn.getTemperatura().getValor());

        arVentoBaumn.diminuirTemperatura();
        arVentoBaumn.diminuirTemperatura();
        assertEquals(23, arVentoBaumn.getTemperatura().getValor());
    }

    @Test
    public void testAdaptadorArGellaKazaLoopAjusteTemperatura() {
        arGellaKaza.ligar();

        arGellaKaza.definirTemperatura(new Temperatura(20));
        assertEquals(20, arGellaKaza.getTemperatura().getValor());

        arGellaKaza.definirTemperatura(new Temperatura(30));
        assertEquals(30, arGellaKaza.getTemperatura().getValor());
    }

    @Test
    public void testModoSonoDesligaTudo() {
        luzPhellipes.ligar();
        persianaSolarius.abrir();
        arVentoBaumn.ligar();

        central.ativarModoSono();

        assertFalse(luzPhellipes.isLigada());
        assertFalse(luzShoyuMi.isLigada());
        assertFalse(persianaSolarius.isAberta());
        assertFalse(arVentoBaumn.isLigado());
    }

    @Test
    public void testModoTrabalhoLigaAjustaTudo() {
        central.ativarModoSono();

        central.ativarModoTrabalho();

        assertTrue(luzPhellipes.isLigada());
        assertTrue(persianaNatLight.isAberta());
        assertTrue(arGellaKaza.isLigado());
        assertEquals(25, arVentoBaumn.getTemperatura().getValor());
        assertEquals(25, arGellaKaza.getTemperatura().getValor());
    }
}