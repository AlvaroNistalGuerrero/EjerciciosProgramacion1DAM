package CadenasDeCaracteres;

import java.util.Scanner;

public class E6 {

    public static double calcularResultado(char primeraLetra, int numero, char ultimoCaracter) {
        System.out.println("Inserte cadenas : ");
        double resultado = 0;

        if (Character.isUpperCase(primeraLetra)) {
            resultado = numero * (primeraLetra - 'A' + 1);
        } else {
            resultado = (double) numero / (primeraLetra - 'a' + 1);
        }

        if (Character.isAlphabetic(ultimoCaracter)) {
            resultado = Math.sqrt(resultado);
        } else if (Character.isDigit(ultimoCaracter)) {
            resultado = Math.log(resultado);
        } else {
            resultado = Math.exp(resultado);
        }

        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumaTotal = 0;

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            if (linea.isEmpty()) {
                break;
            }

            String[] secuencias = linea.split("\\s+");
            for (String secuencia : secuencias) {
                char primeraLetra = secuencia.charAt(0);
                int numero = Integer.parseInt(secuencia.substring(1, secuencia.length() - 1));
                char ultimoCaracter = secuencia.charAt(secuencia.length() - 1);

                double resultado = calcularResultado(primeraLetra, numero, ultimoCaracter);
                sumaTotal += resultado;
            }
        }

        System.out.println("La suma total de los valores numéricos obtenidos es: " + sumaTotal);

    }
}
