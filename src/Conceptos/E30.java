package Conceptos;
/*
Escribir un programa que lea 10 líneas,
cada una de ellas de un máximo de 50 caracteres
y ordénalas por número de caracteres en un array.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class E30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineas = new String[10];

        System.out.println("Introduce 10 líneas de un máximo de 50 caracteres cada una:");
        for (int i = 0; i < 10; i++) {
            lineas[i] = scanner.nextLine();
        }

        Arrays.sort(lineas, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        });

        System.out.println("Líneas ordenadas por longitud:");
        for (String linea : lineas) {
            System.out.println(linea);
        }
    }
}

