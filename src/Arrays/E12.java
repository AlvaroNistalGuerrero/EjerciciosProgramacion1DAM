package Arrays;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int numAlumnos = Integer.parseInt(scanner.nextLine());

        String[] nombres = new String[numAlumnos];
        double[][] calificaciones = new double[numAlumnos][3]; // Tres evaluaciones

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la calificación de la evaluación " + (j + 1) + " para " + nombres[i] + ": ");
                calificaciones[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Mostrar la nota media de todos los alumnos");
            System.out.println("2. Mostrar la nota media de un alumno determinado");
            System.out.println("3. Visualizar las notas por evaluación y la nota final de cada evaluación");
            System.out.println("4. Visualizar las notas por evaluación y la nota final de un alumno determinado");
            System.out.println("5. Calcular la nota media del curso");
            System.out.println("6. Calcular la nota más alta y la más baja e indicar a qué alumno y evaluación pertenece");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    mostrarNotaMediaTodosAlumnos(nombres, calificaciones);
                    break;
                case 2:
                    mostrarNotaMediaAlumnoDeterminado(nombres, calificaciones);
                    break;
                case 3:
                    visualizarNotasPorEvaluacion(calificaciones);
                    break;
                case 4:
                    visualizarNotasPorEvaluacionAlumnoDeterminado(nombres, calificaciones);
                    break;
                case 5:
                    calcularNotaMediaCurso(calificaciones);
                    break;
                case 6:
                    calcularNotaMasAltaYBaja(nombres, calificaciones);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 7);
    }

    public static void mostrarNotaMediaTodosAlumnos(String[] nombres, double[][] calificaciones) {
        double sumaTotal = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            double sumaAlumno = 0;
            for (int j = 0; j < 3; j++) {
                sumaAlumno += calificaciones[i][j];
            }
            sumaTotal += sumaAlumno / 3;
        }
        System.out.println("La nota media de todos los alumnos es: " + sumaTotal / calificaciones.length);
    }

    public static void mostrarNotaMediaAlumnoDeterminado(String[] nombres, double[][] calificaciones) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                double suma = 0;
                for (int j = 0; j < 3; j++) {
                    suma += calificaciones[i][j];
                }
                System.out.println("La nota media de " + nombre + " es: " + suma / 3);
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void visualizarNotasPorEvaluacion(double[][] calificaciones) {
        for (int j = 0; j < 3; j++) {
            System.out.println("Evaluación " + (j + 1) + ":");
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i][j]);
            }
        }
    }

    public static void visualizarNotasPorEvaluacionAlumnoDeterminado(String[] nombres, double[][] calificaciones) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                System.out.println("Notas de " + nombre + " por evaluación:");
                for (int j = 0; j < 3; j++) {
                    System.out.println("Evaluación " + (j + 1) + ": " + calificaciones[i][j]);
                }
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void calcularNotaMediaCurso(double[][] calificaciones) {
        double sumaTotal = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < 3; j++) {
                sumaTotal += calificaciones[i][j];
            }
        }
        System.out.println("La nota media del curso es: " + sumaTotal / (calificaciones.length * 3));
    }

    public static void calcularNotaMasAltaYBaja(String[] nombres, double[][] calificaciones) {
        double notaMasAlta = Double.MIN_VALUE;
        double notaMasBaja = Double.MAX_VALUE;
        String alumnoNotaMasAlta = "";
        String alumnoNotaMasBaja = "";
        int evaluacionNotaMasAlta = -1;
        int evaluacionNotaMasBaja = -1;

        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (calificaciones[i][j] > notaMasAlta) {
                    notaMasAlta = calificaciones[i][j];
                    alumnoNotaMasAlta = nombres[i];
                    evaluacionNotaMasAlta = j + 1;
                }
                if (calificaciones[i][j] < notaMasBaja) {
                    notaMasBaja = calificaciones[i][j];
                    alumnoNotaMasBaja = nombres[i];
                    evaluacionNotaMasBaja = j + 1;
                }
            }
        }

        System.out.println("La nota más alta es " + notaMasAlta + " y pertenece a " + alumnoNotaMasAlta + " en la evaluación " + evaluacionNotaMasAlta);
        System.out.println("La nota más baja es " + notaMasBaja + " y pertenece a " + alumnoNotaMasBaja + " en la evaluación " + evaluacionNotaMasBaja);
    }
}

