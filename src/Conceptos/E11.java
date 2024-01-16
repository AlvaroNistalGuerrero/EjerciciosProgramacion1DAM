package Conceptos;

import java.util.Scanner;

/*
 * Construir un programa que
 * indique si un número introducido
 * por teclado es positivo, negativo
 * o cero.
 */
public class E11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double linea = sc.nextDouble();
        double num = linea;
        if (num > 0)
            System.out.print("El numero es positivo");
        else if(num < 0)
            System.out.print("El numero es negativo");
        else
            System.out.print("El numero es 0, ni negativo, ni positivo");

    }
}
