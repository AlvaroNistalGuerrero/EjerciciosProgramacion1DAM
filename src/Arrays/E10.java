package Arrays;
import java.util.Random;

public class E10 {

    public static void main(String[] args) {
        int filas = new Random().nextInt(19) + 2;
        int columnas = new Random().nextInt(19) + 2;

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = new Random().nextInt(100);
            }
        }

        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < filas; i++) {
            int suma = 0;
            for (int valor : matriz[i]) {
                suma += valor;
            }
            System.out.println("Suma de la fila " + i + ": " + suma);
        }

        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            for (int i = 0; i < filas; i++) {
                suma += matriz[i][j];
            }
            System.out.print(suma + " ");
        }
    }
}
