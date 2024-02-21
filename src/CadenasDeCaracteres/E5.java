package CadenasDeCaracteres;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un nombre: ");
        String nombre = sc.nextLine().trim();

        int longitud = nombre.length();

        if (longitud <= 2) {
            System.out.println("El nombre es demasiado corto para sustituir caracteres centrales.");
        } else {
            String asterisco = "****************";
            String resultado = nombre.substring(0, 1) + asterisco.substring(longitud - 2) + nombre.substring(longitud - 1);
            System.out.println("Resultado: " + resultado);
        }

        sc.close();
    }
}
