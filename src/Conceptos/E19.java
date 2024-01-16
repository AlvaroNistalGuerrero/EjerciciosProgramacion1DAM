package Conceptos;

import java.util.Scanner;

/*
Escribir un programa que dado un número introducido por
teclado calcule la suma de todos los enteros desde 1 hasta este número.
 */
public class E19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero por teclado : ");
        int num = sc.nextInt();
        int suma = 0;
        for (int i = 0; i <= num; i++) {
            suma += i ;

        }
        System.out.println("Suma de los enteros hasta el numero insertado: " + suma);
    }
}
