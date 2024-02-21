package Conceptos;

import java.util.ArrayList;
import java.util.Scanner;

/*
Diseñar un programa que lea una frase por teclado e
indique cuantos espacios en blanco tiene.
 */
public class E34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] porEspacios = str.split(" ");
        int espacios = porEspacios.length-1;
        System.out.println("Contiene " + espacios + " espacios en blanco");
    }
}
