package Conceptos;

import java.util.Scanner;

/*
Resuelve el ejercicio 10 con un método que lleve como parámetros los coeficientes de la ecuación de segundo grado.

Ejer 10:
Escribir y ejecutar un programa que resuelva una ecuación de 2º grado introduciendo por teclado las constantes a, b y c.
 */
public class E24 {
    public static int a = 3;
    public static int b = 2;
    public static int c = 1;
    public static void main(String[] args) {
        double seg_grad_1 = (- b + Math.sqrt(b*b - 4*a*c)) / 2 *a;
        double seg_grad_2 = (- b - Math.sqrt(b*b - 4*a*c)) / 2 *a;
        System.out.printf("El primer resultado = %.2f , El segundo resultado = %.2f", seg_grad_1,seg_grad_2);
    }

}
