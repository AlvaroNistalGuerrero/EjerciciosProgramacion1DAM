package Conceptos;

import java.util.Arrays;
import java.util.Scanner;

/*
Escriba un programa que obtenga los 20 primeros números primos, los introduzca en un array, y muestre ese array por pantalla.
 */
public class E26 {
    public int[] primos = new int[21];

    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos números primos quieres almacenar: ");
        int maxPrimos = sc.nextInt();
        int[] primos = new int[maxPrimos];
        int numPrimos = 0;
        int n = 1;
        do {
            if (esPrimo(n)) {
                primos[numPrimos] = n;
                numPrimos++;
            }
            n++;
        } while (numPrimos < maxPrimos);
        System.out.println(Arrays.toString(primos));
    }



    static boolean esPrimo(int n) {
        int divisor = n - 1;
        while (divisor > 1 && n % divisor != 0)
            divisor--;
        return divisor <= 1;
    }

}
