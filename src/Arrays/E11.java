package Arrays;

import java.util.Scanner;

public class E11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de secuencias: ");
        int numSecuencias = scanner.nextInt();

        int totalNumeros = 0;
        for (int i = 0; i < numSecuencias; i++) {
            System.out.print("Introduce la cantidad de números de la secuencia " + (i + 1) + ": ");
            int cantidadNumeros = scanner.nextInt();
            totalNumeros += cantidadNumeros;
        }

        int[] array = new int[totalNumeros];
        int index = 0;

        for (int i = 0; i < numSecuencias; i++) {
            System.out.println("Introduce los números de la secuencia " + (i + 1) + ":");
            int cantidadNumeros = scanner.nextInt();
            for (int j = 0; j < cantidadNumeros; j++) {
                array[index] = scanner.nextInt();
                index++;
            }
        }

        System.out.println("Los números almacenados en el array son:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

