package Conceptos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que convierta de euros a dólares.
 * El resultado de la conversión se mostrará en la salida estándar
 * con una precisión de 2 decimales.
 */

public class E3 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double euros ;
        System.out.println("Introduce cuantos euros quieres cambiar");
        String linea = in.readLine();
        euros = Integer.parseInt(linea);
        double dolares = euros * 0.91;
        System.out.printf("Tines una cantidad de %.2f dolares" , dolares );


    }

}