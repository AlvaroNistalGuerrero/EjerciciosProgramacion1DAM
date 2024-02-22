package Arrays;

import java.util.Random;

public class E6 {
    public static void main(String[] args) {
        Random random = new Random();
        int tamano = random.nextInt(491) + 10; // Tamaño aleatorio entre 10 y 500 elementos
        int[] vector = new int[tamano];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(201) - 100; // Números aleatorios entre -100 y 100
        }

        if (vector.length <= 50) {
            mostrarVector(vector);
        }

        int secuenciasRepetidas = contarSecuenciasRepetidas(vector);
        System.out.println("Número de secuencias de números repetidos: " + secuenciasRepetidas);
    }

    public static void mostrarVector(int[] vector) {
        System.out.println("Contenido del vector:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int contarSecuenciasRepetidas(int[] vector) {
        int secuencias = 0;
        boolean enSecuencia = false;

        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] == vector[i + 1]) {
                if (!enSecuencia) {
                    secuencias++;
                    enSecuencia = true;
                }
            } else {
                enSecuencia = false;
            }
        }

        return secuencias;
    }
}
