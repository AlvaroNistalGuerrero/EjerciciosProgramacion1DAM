package Arrays;

import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();
        scanner.nextLine();

        char[][] matriz = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            matriz[i] = scanner.nextLine().toCharArray();
        }

        char caracterRelleno = scanner.nextLine().charAt(0);

        int filaInicial = scanner.nextInt();
        int columnaInicial = scanner.nextInt();

        mostrarMatriz(matriz);
        rellenar(matriz, filaInicial, columnaInicial, matriz[filaInicial][columnaInicial], caracterRelleno);
        mostrarMatriz(matriz);
    }

    public static void rellenar(char[][] matriz, int fila, int columna, char caracterInicial, char caracterRelleno) {
        if (fila < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length || matriz[fila][columna] != caracterInicial) {
            return;
        }

        matriz[fila][columna] = caracterRelleno;

        rellenar(matriz, fila - 1, columna, caracterInicial, caracterRelleno);
        rellenar(matriz, fila + 1, columna, caracterInicial, caracterRelleno);
        rellenar(matriz, fila, columna - 1, caracterInicial, caracterRelleno);
        rellenar(matriz, fila, columna + 1, caracterInicial, caracterRelleno);
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

