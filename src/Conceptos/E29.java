package Conceptos;

import java.util.Scanner;

/*
Diseñar un programa que determine la media
de las calificaciones en cada asignatura de primero de
bachillerato para 10 alumnos. Emplear arrays para resolver el ejercicio.
 */
public class E29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAsignaturas = 3;
        int numAlumnos = 10;

        double[][] calificaciones = new double[numAlumnos][numAsignaturas];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingrese las calificaciones del alumno " + (i + 1) + ":");
            for (int j = 0; j < numAsignaturas; j++) {
                System.out.print("Asinatura " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nMedia de calificaciones por asignatura:");
        for (int j = 0; j < numAsignaturas; j++) {
            double suma = 0;
            for (int i = 0; i < numAlumnos; i++) {
                suma += calificaciones[i][j];
            }
            double media = suma / numAlumnos;
            System.out.println("Asinatura " + (j + 1) + ": " + media);
        }

        scanner.close();
    }
}
