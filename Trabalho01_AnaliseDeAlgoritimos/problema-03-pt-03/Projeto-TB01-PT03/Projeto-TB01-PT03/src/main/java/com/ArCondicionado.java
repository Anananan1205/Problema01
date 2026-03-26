package com;

public interface ArCondicionado {
    void ligar();
    void desligar();
    void aumentarTemperatura();
    void diminuirTemperatura();
    void definirTemperatura(Temperatura temperatura);
    boolean isLigado();
    Temperatura getTemperatura();
}