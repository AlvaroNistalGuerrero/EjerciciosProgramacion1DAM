package CadenasDeCaracteres;

import java.util.Scanner;

/*
Escribe un programa que lea nombres y construya un triángulo
con sus caracteres tal y como se muestra en el ejemplo siguiente:
El programa finalizará cuando lea la palabra “fin”.
 */
public class E4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserte una cadena de caracteres: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length()-1; j >= 1; j--){
                System.out.println("");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(str.charAt(k) + " ");
            }
        }

    }
}
