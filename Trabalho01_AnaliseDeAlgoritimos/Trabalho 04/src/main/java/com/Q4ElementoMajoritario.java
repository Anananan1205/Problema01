package com;

public class Q4ElementoMajoritario {

    private static int contar(int[] A, int inicio, int fim, int valor) {
        if (inicio > fim) return 0;

        int meio  = (inicio + fim) / 2;
        int count = (A[meio] == valor) ? 1 : 0;

        return count
             + contar(A, inicio, meio - 1, valor)
             + contar(A, meio + 1, fim, valor);
    }

    private static Integer majoritario(int[] A, int inicio, int fim) {
        if (inicio == fim) return A[inicio];
        if (inicio > fim)  return null;

        int meio = (inicio + fim) / 2;

        Integer esquerda = majoritario(A, inicio, meio);
        Integer direita  = majoritario(A, meio + 1, fim);

        int tamanho = fim - inicio + 1;

        if (esquerda != null && contar(A, inicio, fim, esquerda) > tamanho / 2)
            return esquerda;

        if (direita != null && contar(A, inicio, fim, direita) > tamanho / 2)
            return direita;

        return null;
    }

    public static void main(String[] args) {
        int[] A = {2, 2, 2, 1, 3};
        Integer resultado = majoritario(A, 0, A.length - 1);

        if (resultado != null)
            System.out.println("Elemento majoritario: " + resultado); // 1
        else
            System.out.println("Nao ha elemento majoritario.");
    }
}
