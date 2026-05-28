package com;

public class Q2ElementoIgualIndice {

    public static int encontrar(int[] A, int inicio, int fim) {
        if (inicio > fim) return -1;

        int meio = (inicio + fim) / 2;

        if (A[meio] == meio) return meio;
        if (A[meio] > meio)  return encontrar(A, inicio, meio - 1);
        else                 return encontrar(A, meio + 1, fim);
    }

    public static void main(String[] args) {
        int[] A = {-1, -1, 1, 3, 8, 9};
        int resultado = encontrar(A, 0, A.length - 1);
        System.out.println("A[i] == i no indice: " + resultado); // 3
    }
}
