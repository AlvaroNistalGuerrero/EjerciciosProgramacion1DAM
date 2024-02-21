package Arrays;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de veces que desea lanzar el dado:");
        int N = sc.nextInt();

        int[] contadorCaras = new int[6];

        for (int i = 0; i < N; i++) {
            contadorCaras[(int) (Math.random() * 6)]++;
        }

        System.out.println("Número de veces que salió cada cara del dado:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Cara " + (i + 1) + ": " + contadorCaras[i]);
        }

    }
}
