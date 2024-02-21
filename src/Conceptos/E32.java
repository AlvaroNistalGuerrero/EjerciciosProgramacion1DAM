package Conceptos;

import java.util.Scanner;

/*
Diseñar un programa que lea
una frase de teclado y la muestre en mayúsculas.
 */
public class E32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte una cadena de caracteres");
        String str = sc.nextLine();
        String mayus = str.toUpperCase();
        System.out.println(mayus);
    }
}
