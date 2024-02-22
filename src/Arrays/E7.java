package Arrays;

import java.util.Random;
import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("insert3 el tamaño del vector (entre 10 y 20 elementos): ");
        int tamano = Integer.parseInt(scanner.nextLine());

        if (tamano < 10 || tamano > 20) {
            System.out.println("El tamaño del vector debe estar entre 10 y 20 elementos.");
            return;
        }

        int[] vector = new int[tamano];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(101);
        }

        System.out.println("Contenido del vector:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        int minimaDiferencia = Integer.MAX_VALUE;
        for (int i = 1; i < vector.length; i++) {
            int diferencia = Math.abs(vector[i] - vector[i - 1]);
            minimaDiferencia = Math.min(minimaDiferencia, diferencia);
        }

        System.out.println("La mínima diferencia entre dos valores adyacentes es: " + minimaDiferencia);
    }
}
