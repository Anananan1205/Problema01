package com.mycompany.trabalho36;

import java.util.*;

public class Questao2 {

    public static void main(String[] args) {

        int totalDias = 7;

        String[] nomes  = {"Castelo de Neuschwanstein", "Wiener Philharmoniker", "Opera Garnier", "Last Supper Museum", "Chatsworth House"};
        int[]    pontos = {10, 4, 7, 3, 2};
        int[]    tempo  = {2,  1, 1, 1, 2};

        // ordena pela maior razao pontos/tempo (criterio guloso)
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                double razaoI = (double) pontos[i] / tempo[i];
                double razaoJ = (double) pontos[j] / tempo[j];
                if (razaoJ > razaoI) {
                    int tempInt   = pontos[i]; pontos[i] = pontos[j]; pontos[j] = tempInt;
                    tempInt       = tempo[i];  tempo[i]  = tempo[j];  tempo[j]  = tempInt;
                    String tempS  = nomes[i];  nomes[i]  = nomes[j];  nomes[j]  = tempS;
                }
            }
        }

        System.out.println("Dias disponiveis: " + totalDias);
        System.out.println();
        System.out.println("Lugar                        Tempo usado   Tempo restante");
        System.out.println("----------------------------------------------------------");

        int diasUsados  = 0;
        int totalPontos = 0;
        List<Integer> visitados = new ArrayList<>();

        for (int i = 0; i < nomes.length; i++) {
            if (diasUsados + tempo[i] <= totalDias) {
                diasUsados  += tempo[i];
                totalPontos += pontos[i];
                visitados.add(i);
                System.out.printf("%-30s %d             %d%n",
                    nomes[i] + ":", tempo[i], totalDias - diasUsados);
            }
        }

        System.out.println();
        System.out.print("Total de pontos acumulados: ");
        for (int i = 0; i < visitados.size(); i++) {
            System.out.print(pontos[visitados.get(i)]);
            if (i < visitados.size() - 1) System.out.print(" + ");
        }
        System.out.println(" = " + totalPontos);

        System.out.println();
        System.out.println("Para esse caso e para esses valores o Algoritmo Guloso foi o ideal, mas nem sempre vai ser.");
        System.out.println("O algoritmo e miope: escolhe o melhor a cada passo sem olhar o conjunto todo.");
    }
}
