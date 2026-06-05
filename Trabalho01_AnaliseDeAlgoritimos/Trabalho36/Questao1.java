package com.mycompany.trabalho36;

import java.util.*;

public class Questao1 {

    public static void main(String[] args) {

        int capacidade = 100;

        int[] ids     = {1, 2, 3, 4, 5};
        int[] volumes = {40, 30, 25, 20, 15};

        // ordena pelo maior volume primeiro (criterio guloso)
        for (int i = 0; i < volumes.length - 1; i++) {
            for (int j = i + 1; j < volumes.length; j++) {
                if (volumes[j] > volumes[i]) {
                    int temp = volumes[i]; volumes[i] = volumes[j]; volumes[j] = temp;
                    temp = ids[i];     ids[i]     = ids[j];     ids[j]     = temp;
                }
            }
        }

        System.out.println("Capacidade do caminhao: " + capacidade + "L");
        System.out.println();
        System.out.println("Item      Volume usado   Volume restante");
        System.out.println("-------------------------------------");

        int volumeUsado = 0;
        List<Integer> selecionados = new ArrayList<>();

        for (int i = 0; i < volumes.length; i++) {
            if (volumeUsado + volumes[i] <= capacidade) {
                volumeUsado += volumes[i];
                selecionados.add(i);
                System.out.printf("Item %d       %dL           %dL%n",
                    ids[i], volumes[i], capacidade - volumeUsado);
            }
        }

        System.out.println();
        System.out.print("Total de volume acumulado: ");
        for (int i = 0; i < selecionados.size(); i++) {
            System.out.print(volumes[selecionados.get(i)]);
            if (i < selecionados.size() - 1) System.out.print(" + ");
        }
        System.out.println(" = " + volumeUsado + "L");

        System.out.println();
        System.out.println("Para esse caso o algoritmo guloso nao atingiu a solucao otima.");
        System.out.println("A solucao otima seria Item 1 + Item 3 + Item 4 + Item 5 = 100L.");
        System.out.println("O algoritmo e miope: escolhe o melhor a cada passo sem olhar o conjunto todo.");
    }
}
