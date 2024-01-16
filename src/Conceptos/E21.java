package Conceptos;
/*
Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci.
Investiga en la red la expresión matemática de dicha serie.
 */

import java.util.Scanner;

public class E21 {

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            int a = 0, b = 1, temp;
            for (int i = 2; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte el valor de n");
            int n = sc.nextInt();
            int resultado = fibonacci(n);
            System.out.println("El " + n + "-ésimo término de la serie de Fibonacci es: " + resultado);
        }
    }



