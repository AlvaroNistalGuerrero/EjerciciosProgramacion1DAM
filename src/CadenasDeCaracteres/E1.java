package CadenasDeCaracteres;

import java.util.Scanner;

/*
Escribe un programa que lea dos cadenas y muestre el
número de veces que la segunda está contenida en la primera.
 */
public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte una palabra: ");
        String p1 = sc.nextLine();
        System.out.println("Inserte otra palabra: ");
        String p2 = sc.nextLine();
        int ntot = 0;

        if(p1.contains(p2)){

            System.out.println("La cadena " + p2 + " esta contenida en " + p1 + " un total de : " + ntot );
        }else {
            System.out.println("La cadenas no coinciden");
        }


    }
}
