package ExpresionesRegulares;

import java.util.Scanner;

public class E7 {

    public static boolean esBoletoPremiado(String boleto) {
        if (boleto.length() != 20) {
            return false;
        }

        String primeraMitad = boleto.substring(0, 10);
        String segundaMitad = boleto.substring(10);

        char[] caracteresPremiados = {'$', '&', '@', '#'};

        for (char premiado : caracteresPremiados) {
            if (primeraMitad.contains(String.valueOf(premiado)) && segundaMitad.contains(String.valueOf(premiado))) {
                int longitud = Math.max(contarSecuencia(primeraMitad, premiado), contarSecuencia(segundaMitad, premiado));
                if (longitud >= 6) {
                    System.out.print("Boleto premiado con '" + premiado + "' y longitud de secuencia: " + longitud);
                    if (longitud == 10) {
                        System.out.print(" - BOTE!");
                    }
                    System.out.println();
                    return true;
                }
            }
        }

        return false;
    }

    public static int contarSecuencia(String cadena, char caracter) {
        int contador = 0;
        int maxContador = 0;

        for (char c : cadena.toCharArray()) {
            if (c == caracter) {
                contador++;
                maxContador = Math.max(maxContador, contador);
            } else {
                contador = 0;
            }
        }

        return maxContador;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los boletos separados por comas:");
        String entrada = sc.nextLine();

        String[] boletos = entrada.split(",\\s*");

        for (String boleto : boletos) {
            if (esBoletoPremiado(boleto)) {
                System.out.println("Boleto premiado: " + boleto);
            } else {
                System.out.println("Boleto NO VÁLIDO: " + boleto);
            }
        }

    }
}
