package Arrays;

import java.util.Random;
import java.util.Scanner;

public class E4 {

    public static int[] crearVector(int tamano) {
        Random random = new Random();
        int[] vector = new int[tamano];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(201) - 100; // Números aleatorios entre -100 y 100
        }

        return vector;
    }

    public static void mostrarVector(int[] vector) {
        System.out.println("Contenido del vector:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int calcularSuma(int[] vector) {
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 13) {
                int sumaSiguiente = 0;
                int j = i + 1;
                while (j < vector.length && j < i + 14) {
                    sumaSiguiente += vector[j];
                    j++;
                }
                if (sumaSiguiente != 7) {
                    break;
                }
            }
            suma += vector[i];
        }

        return suma;
    }

    public static int contarNumerosNoSumados(int[] vector) {
        int numerosNoSumados = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 13) {
                int sumaSiguiente = 0;
                int j = i + 1;
                while (j < vector.length && j < i + 14) {
                    sumaSiguiente += vector[j];
                    j++;
                }
                if (sumaSiguiente != 7) {
                    numerosNoSumados = j - i - 1;
                    break;
                }
            }
        }

        return numerosNoSumados;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector (entre 10 y 200 elementos): ");
        int tamano = scanner.nextInt();

        if (tamano < 10 || tamano > 200) {
            System.out.println("El tamaño del vector debe estar entre 10 y 200 elementos.");
            return;
        }

        int[] vector = crearVector(tamano);
        mostrarVector(vector);
        int suma = calcularSuma(vector);
        int numerosNoSumados = contarNumerosNoSumados(vector);

        System.out.println("Suma de los números almacenados: " + suma);
        System.out.println("Cantidad de números que no se han sumado: " + numerosNoSumados);
    }
}
