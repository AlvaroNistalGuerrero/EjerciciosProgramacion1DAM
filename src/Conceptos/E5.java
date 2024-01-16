package Conceptos;
/*
Escribir y ejecutar un programa que nos devuelva el espacio
recorrido por un vehículo con velocidad inicial 5 m/s,
aceleración 2 m/s2 y espacio inicial recorrido 5 m.
 */

import java.util.Scanner;

public class E5 {
        public static void main(String[] args)  {
            System.out.println("Inserte el tiempo trancurrido en segundos");
            Scanner sc = new Scanner(System.in);
            double linea = sc.nextDouble();
            double t = linea;
            double velocidad_inical = 5;
            double aceleracion = 2;
            double x_inical = 5;
            double x_final = x_inical + velocidad_inical * t + ((aceleracion * Math.pow(t,2)/2));
            System.out.print("El vehiculo ha recorrido " + x_final + " metros");

        }
    }

