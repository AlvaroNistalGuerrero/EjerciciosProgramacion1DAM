package Conceptos;

import java.util.Scanner;

public class E35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contraseña = "secreto";
        int longitudContraseña = contraseña.length();
        boolean acertado = false;

        System.out.println("Bienvenido al juego 'La Contraseña'!");

        while (!acertado) {
            System.out.println("Introduce una palabra:");
            String intento = sc.nextLine();

            if (intento.equals(contraseña)) {
                acertado = true;
                System.out.println("¡Felicidades! Has acertado la contraseña.");
            } else {
                int letrasCorrectas = 0;

                for (int i = 0; i < longitudContraseña; i++) {
                    if (i < intento.length() && intento.charAt(i) == contraseña.charAt(i)) {
                        letrasCorrectas++;
                    }
                }

                System.out.println("Letras acertadas: " + letrasCorrectas);
            }
        }

    }
}
