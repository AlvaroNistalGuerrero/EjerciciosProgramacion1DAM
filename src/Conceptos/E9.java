package Conceptos;
/*
Escribe un programa que permita a un estudiante saber
cuál será su nota media en cada una las tres materias que cursa
y la nota media global. Los criterios de calificación para examen y tareas,
así como el número de tareas realizadas, se muestran en la tabla siguiente:
 */

import java.util.Scanner;

public class E9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("	Vamos a calcular tu media en matematicas : ");
        System.out.println("");
        System.out.println("Introduce la nota del examen de matematicas ");
        double linea = sc.nextDouble();
        double ex_mate = linea;
        System.out.println("Introduce la nota de la tarea 1 de matematicas ");
        linea = sc.nextDouble();
        double t1_mate = linea;
        System.out.println("Introduce la nota de la tarea 2 de matematicas ");
        linea = sc.nextDouble();
        double t2_mate = linea;
        System.out.println("Introduce la nota de la tarea 3 de matematicas ");
        linea = sc.nextDouble();
        double t3_mate = linea;
        double media_mate = 0.9 * ex_mate + 0.1 * ((t1_mate + t2_mate + t3_mate)/3);
        System.out.printf("Tu nota media de matematicas es un %2.2f ",media_mate);
        System.out.println("");
        System.out.println("");

        //Fisica

        System.out.println("	Vamos a calcular tu media en fisica : ");
        System.out.println("");
        System.out.println("Introduce la nota del examen de fisica ");
        double ex_fisica = sc.nextDouble();
        System.out.println("Introduce la nota de la tarea 1 de fisica ");
        double t1_fisica = sc.nextDouble();
        System.out.println("Introduce la nota de la tarea 2 de fisica ");
        double t2_fisica = sc.nextDouble();
        double media_fisica = 0.8 * ex_fisica + 0.2 * ((t1_fisica + t2_fisica)/2);
        System.out.printf("Tu nota media de matematicas es un %2.2f ",media_fisica);
        System.out.println("");
        System.out.println("");

        //Quimica

        System.out.println("	Vamos a calcular tu media en quimica : ");
        System.out.println("");
        System.out.println("Introduce la nota del examen de quimica ");
        linea = sc.nextDouble();
        double ex_qui = linea;
        System.out.println("Introduce la nota de la tarea 1 de quimica ");
        linea = sc.nextDouble();
        double t1_qui = linea;
        System.out.println("Introduce la nota de la tarea 2 de quimica ");
        linea = sc.nextDouble();
        double t2_qui = linea;
        System.out.println("Introduce la nota de la tarea 3 de quimica ");
        linea = sc.nextDouble();
        double t3_qui = linea;
        double media_qui = 0.85 * ex_qui + 0.15 * ((t1_qui + t2_qui + t3_qui)/3);
        System.out.printf("Tu nota media de matematicas es un %2.2f ",media_qui);
        System.out.println("");
        System.out.println("");

        //Global
        double global = ((media_fisica + media_mate + media_qui) / 3);
        System.out.printf("Tu nota global es un %2.2f ",global);



    }
}
