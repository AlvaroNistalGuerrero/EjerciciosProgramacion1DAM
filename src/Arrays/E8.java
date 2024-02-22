package Arrays;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[10];

        System.out.println("Introduce los nombres de 10 personas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        String cadenaMasLarga = encontrarCadenaMasLarga(nombres);
        System.out.println("La cadena de mayor longitud es: " + cadenaMasLarga);
    }

    public static String encontrarCadenaMasLarga(String[] vector) {
        String cadenaMasLarga = "";

        for (String cadena : vector) {
            if (cadena.length() > cadenaMasLarga.length()) {
                cadenaMasLarga = cadena;
            }
        }

        return cadenaMasLarga;
    }
}
