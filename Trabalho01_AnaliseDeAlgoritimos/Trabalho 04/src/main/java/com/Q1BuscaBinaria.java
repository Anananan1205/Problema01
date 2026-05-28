package com;

public class Q1BuscaBinaria {

    public static int buscar(int[] A, int valor, int inicio, int fim) {
        if (inicio > fim) return -1;

        int meio = (inicio + fim) / 2;

        if (A[meio] == valor) return meio;
        if (valor < A[meio]) return buscar(A, valor, inicio, meio - 1);
        else return buscar(A, valor, meio + 1, fim);
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9, 11};

        int valor = 7;
        int resultado = buscar(A, valor, 0, A.length - 1);
        System.out.println("Busca pelo valor " + valor + ": indice " + resultado); // 3

        int valorAusente = 4;
        int resultadoAusente = buscar(A, valorAusente, 0, A.length - 1);
        System.out.println("Busca pelo valor " + valorAusente + ": indice " + resultadoAusente); // -1
    }
}
