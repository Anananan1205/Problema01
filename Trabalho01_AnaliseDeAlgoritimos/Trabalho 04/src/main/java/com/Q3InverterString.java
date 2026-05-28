package com;

public class Q3InverterString {

    public static String inverter(String s, int inicio, int fim) {
        if (inicio >= fim) return s;

        char[] chars  = s.toCharArray();
        char temp     = chars[inicio];
        chars[inicio] = chars[fim];
        chars[fim]    = temp;

        return inverter(new String(chars), inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        String s = "A1B2C3D4E5";
        String resultado = inverter(s, 0, s.length() - 1);
        System.out.println("Original: " + s);
        System.out.println("Invertida: " + resultado); // BRUF
    }
}
