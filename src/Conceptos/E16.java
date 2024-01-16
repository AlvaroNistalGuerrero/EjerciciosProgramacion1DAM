package Conceptos;

import java.util.Scanner;

/*
Escribir un programa que realice un juego que consiste
en acertar un número desconocido generado aleatoriamente entre uno y cien.
Para ello se leerán de teclado números, y se compararán con el número secreto,
 indicando si son mayores o menores que este, hasta acertar.
 */
public class E16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_rand = (int) (Math.random()*99+1);
        int insertado = 0;
        int intentos = 1;
        System.out.println("Prueba con numeros del 1 al 100 para adivinar el numero oculto");
        do{

            insertado = sc.nextInt();
            intentos--;
            if(insertado > num_rand){
                System.out.println("El que buscas es menor que el insertado");
            } else if (insertado < num_rand) {
                System.out.println("El numero que buscas es mayor que el insertado");
            }
            System.out.println("Te quedan " + intentos + " intentos");
        }while (insertado != num_rand && intentos > 0 );
        System.out.println("Te has quedado sin intentos");
        if (insertado == num_rand){
            System.out.println("Has acertado el numero era " + num_rand);
        }else
            System.out.println("No lo has conseguido, el numero era " + num_rand);
    }
}
