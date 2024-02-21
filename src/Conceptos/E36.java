package Conceptos;
/*
Introducir por teclado dos palabras e
indicar cual es la que tiene menos caracteres.
 */

import java.util.Scanner;

public class E36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena : ");
        String st1 = sc.nextLine();
        System.out.println("Introduce otra cadena : ");
        String st2 = sc.nextLine();
        if (st1.length()>st2.length()){
            System.out.println(st2 + " tiene menos caracteres");
        }else{
            System.out.println(st1 + "tiene menos caracteres");
        }

    }
}
