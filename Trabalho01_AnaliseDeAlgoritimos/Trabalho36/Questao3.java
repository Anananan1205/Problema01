package com.mycompany.trabalho36;

import java.util.*;

public class Questao3 {

    public static void main(String[] args) {

        Set<String> estadosAlvo = new HashSet<>(Arrays.asList("MT","RJ","ES","SP","SC","RS","PR","MS"));

        String[] nomes = {"Kum", "Kdois", "Ktres", "Kquatro", "Kcinco"};
        List<Set<String>> coberturas = new ArrayList<>();
        coberturas.add(new HashSet<>(Arrays.asList("SP","SC","RS")));
        coberturas.add(new HashSet<>(Arrays.asList("RJ","SP","MT")));
        coberturas.add(new HashSet<>(Arrays.asList("ES","SC","PR")));
        coberturas.add(new HashSet<>(Arrays.asList("SC","RS")));
        coberturas.add(new HashSet<>(Arrays.asList("PR","MS")));

        System.out.println("Estados a cobrir: " + estadosAlvo);
        System.out.println();
        System.out.println("Estacao     Novos estados cobertos        Estados sem cobertura");
        System.out.println("-----------------------------------------------------------------------");

        Set<String> naoCobertos = new HashSet<>(estadosAlvo);
        List<String> selecionadas = new ArrayList<>();
        boolean[] usada = new boolean[nomes.length];

        while (!naoCobertos.isEmpty()) {
            int melhorIdx = -1;
            int melhorQtd = 0;

            for (int i = 0; i < nomes.length; i++) {
                if (usada[i]) continue;
                Set<String> novos = new HashSet<>(coberturas.get(i));
                novos.retainAll(naoCobertos);
                if (novos.size() > melhorQtd) {
                    melhorQtd = novos.size();
                    melhorIdx = i;
                }
            }

            if (melhorIdx == -1) break;

            Set<String> novos = new HashSet<>(coberturas.get(melhorIdx));
            novos.retainAll(naoCobertos);

            usada[melhorIdx] = true;
            selecionadas.add(nomes[melhorIdx]);
            naoCobertos.removeAll(coberturas.get(melhorIdx));

            System.out.printf("%-12s %-32s %s%n", nomes[melhorIdx], novos, naoCobertos);
        }

        System.out.println();
        System.out.print("Estacoes contratadas: ");
        for (int i = 0; i < selecionadas.size(); i++) {
            System.out.print(selecionadas.get(i));
            if (i < selecionadas.size() - 1) System.out.print(" + ");
        }
        System.out.println(" = " + selecionadas.size() + " estacoes");

        System.out.println();
        System.out.println("Para esse caso e para esses valores o Algoritmo Guloso foi o ideal, mas nem sempre vai ser.");
        System.out.println("O algoritmo e miope: escolhe o melhor a cada passo sem olhar o conjunto todo.");
    }
}
