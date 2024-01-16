package Conceptos;

import java.util.Scanner;

/*
Escribir un programa que introduzca N números reales desde teclado, los sume y calcule la media, mostrándola por pantalla.
 */
public class E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos datos va a añadir?");
        int n = sc.nextInt();
        double suma = 0;
        for (int i = 1; i <= n; i++){
            System.out.println("Añada un valor a la suma");
            double n2 = sc.nextInt();
            suma = n2 + suma;

        }

        double media = suma / n;
        System.out.println("La media es : " + media);
    }
}
