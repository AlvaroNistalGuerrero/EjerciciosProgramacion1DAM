package Conceptos;

import java.util.Scanner;

/*
Escribir y ejecutar un programa que resuelva una ecuación
de 2º grado introduciendo por teclado las constantes a, b y c.
 */
public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la varibale a");
        double a = sc.nextInt();
        System.out.println("Introduce el valor de la varibale b");
        double b = sc.nextInt();
        System.out.println("Introduce el valor de la varibale c");
        double c = sc.nextInt();
        double seg_grad_1 = (- b + Math.sqrt(b*b - 4*a*c)) / 2 *a;
        double seg_grad_2 = (- b - Math.sqrt(b*b - 4*a*c)) / 2 *a;
        System.out.printf("El primer resultado = %.2f , El segundo resultado = %.2f", seg_grad_1,seg_grad_2);
    }

}
