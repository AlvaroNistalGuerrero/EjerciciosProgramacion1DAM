package Conceptos;

import java.util.Scanner;

/*
Escribir un programa que introduzca las edades de una serie de alumnos,
y que se detendrá al introducir un numero negativo.
Se calculará la media, la suma y el número de alumnos con más de 18 años.
 */
public class E18 {
    public static void main(String[] args) throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int mayores18 = 0;
        int edad;
        int alumnos = 0;
        System.out.println("Edad: ");
        while ((edad = sc.nextInt()) >=0) {
            total += edad;
            if(edad > 18)
                mayores18++;
            alumnos++;
            System.out.println("Edad: ");
        }
        if(alumnos < 0)
            System.out.println("NO se han introducido datos");
        else {
            System.out.println("Edad media :" + ((float)total/alumnos));
            System.out.println("Total :" + total);
            System.out.println("Mayores de 18 :" + mayores18);
        }
    }
}
