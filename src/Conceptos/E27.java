package Conceptos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Desarrolle un juego en el que se tenga que adivinar una combinación secreta
formada por n números del 1 al 5, donde n se introducirá por teclado.
Se generará una combinación aleatoria de n elementos que el usuario tendrá que acertar.
En cada intento se muestra si el digito que introduce el jugador es mayor,
menor o igual que el que corresponde en la combinación secreta.
 */
public class E27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinanza!");

        System.out.print("Ingrese la longitud de la combinación (n): ");
        int n = scanner.nextInt();

        int[] combinacionSecreta = generarCombinacionSecreta(n);

        boolean juegoTerminado = false;
        int intentos = 0;

        while (!juegoTerminado) {
            System.out.print("Introduce tu adivinanza (separados por espacios): ");
            int[] adivinanzaUsuario = new int[n];
            for (int i = 0; i < n; i++) {
                adivinanzaUsuario[i] = scanner.nextInt();
            }

            String resultado = comprobarAdivinanza(adivinanzaUsuario, combinacionSecreta);
            System.out.println("Resultado: " + resultado);

            if (resultado.equals("Igual")) {
                juegoTerminado = true;
                System.out.println("¡Felicidades! Adivinaste la combinación secreta en " + (intentos + 1) + " intentos.");
            } else {
                intentos++;
            }
        }

        scanner.close();
    }

    private static int[] generarCombinacionSecreta(int longitud) {
        Random random = new Random();
        int[] combinacion = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            combinacion[i] = random.nextInt(5) + 1; // Números del 1 al 5
        }
        return combinacion;
    }

    private static String comprobarAdivinanza(int[] adivinanzaUsuario, int[] combinacionSecreta) {
        if (Arrays.equals(adivinanzaUsuario, combinacionSecreta)) {
            return "Igual";
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < adivinanzaUsuario.length; i++) {
            if (adivinanzaUsuario[i] < combinacionSecreta[i]) {
                resultado.append("Menor ");
            } else if (adivinanzaUsuario[i] > combinacionSecreta[i]) {
                resultado.append("Mayor ");
            } else {
                resultado.append("Igual ");
            }
        }

        return resultado.toString().trim();
    }
}

