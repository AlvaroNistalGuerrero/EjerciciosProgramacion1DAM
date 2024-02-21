package Conceptos;

import java.util.ArrayList;
import java.util.Scanner;

/*
Escribe un programa que incluya un método que
lleve como parámetro un String introducido por teclado
y que busque en él las vocales indicándonos la posición en la que están.
 */
public class E31 {
    public static void buscarVocales(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (esVocal(caracter)) {
                System.out.println("Vocal '" + caracter + "' encontrada en la posición " + i);
            }
        }
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto:");
        String texto = scanner.nextLine();

        buscarVocales(texto);
    }

}
