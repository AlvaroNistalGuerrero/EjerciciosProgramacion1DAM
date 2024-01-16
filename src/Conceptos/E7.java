package Conceptos;

/*
 * Emplear la fórmula de la gravitación universal
 * Para obtener el valor de F.
 * Se introducirán por teclado las masas m1 y m2,
 * y la distancia entre ellas.
 */

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        final double G = 6.67e-11;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la masa numero 1");
        double linea = sc.nextDouble();
        double m1 = linea;
        System.out.println("Introduce la masa numero 2");
        linea = sc.nextDouble();
        double m2 = linea;
        System.out.println("Introduce la distancia entre las dos masas");
        linea = sc.nextDouble();
        double distance = linea;
        double result = G * ((m1*m2)/ Math.pow(distance, 2));
        System.out.println("Según la formula de la gravitacion universal: ");
        System.out.print("F = " + result + " N");

    }
}
