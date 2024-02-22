package Arrays;

import java.util.Arrays;
import java.util.Random;

public class E14 {
    public static void main(String[] args) {
        Random random = new Random();

        int longitud1 = random.nextInt(91) + 10;
        int[] vector1 = random.ints(longitud1, 0, 100).toArray();

        int longitud2 = random.nextInt(91) + 10;
        int[] vector2 = random.ints(longitud2, 0, 100).toArray();

        Arrays.sort(vector1);
        Arrays.sort(vector2);

        int[] vectorMezclado = new int[longitud1 + longitud2];
        int i = 0, j = 0, k = 0;
        while (i < longitud1 && j < longitud2) {
            vectorMezclado[k++] = (vector1[i] < vector2[j]) ? vector1[i++] : vector2[j++];
        }
        while (i < longitud1) {
            vectorMezclado[k++] = vector1[i++];
        }
        while (j < longitud2) {
            vectorMezclado[k++] = vector2[j++];
        }

        System.out.println("Contenido del primer vector ordenado: " + Arrays.toString(vector1));
        System.out.println("Contenido del segundo vector ordenado: " + Arrays.toString(vector2));
        System.out.println("Contenido del vector mezclado manteniendo la ordenación: " + Arrays.toString(vectorMezclado));
    }
}

