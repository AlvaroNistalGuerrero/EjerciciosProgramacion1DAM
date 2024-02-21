package Conceptos;

import java.util.Scanner;

public class E37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inser5e una frase : ");
        String frase = sc.nextLine().toLowerCase();

        int[] contadorLetras = new int[26];

        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                contadorLetras[c - 'a']++;
            }
        }
        System.out.println("Número de veces que aparece cada letra del abecedario en la frase : ");
        for (int i = 0; i < 26; i++) {
            char letra = (char) ('a' + i);
            if (contadorLetras[i] > 0) {
                System.out.println(letra + ": " + contadorLetras[i]);
            }
        }

    }
}
