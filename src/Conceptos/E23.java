package Conceptos;
/*
Escribir un programa que introduciendo las coordenadas x e y de un punto en el espacio de dos dimensiones,
calcule las coordenadas polares. Debe crearse un método que realice esta transformación.
Las ecuaciones de la transformación son:

        𝑥=𝑟×cos𝜃 𝑦=𝑟×sin𝜃

 */

import java.util.Scanner;

public class E23 {

    public static void main(String[] args) {
        E23 e = new E23();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la coordenada x: ");
        double x = scanner.nextDouble();

        System.out.print("Introduce la coordenada y: ");
        double y = scanner.nextDouble();

        e.cartesianAPolares(x,y);

        scanner.close();
    }

    public void cartesianAPolares(double x, double y) {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.toDegrees(Math.atan2(y, x));
        System.out.println("Coordenadas polares: (r = " + r +
                ", θ = " + theta + " grados)");

    }
}


