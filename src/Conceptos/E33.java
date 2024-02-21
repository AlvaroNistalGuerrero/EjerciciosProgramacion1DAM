package Conceptos;

import java.util.Scanner;

/*
Escribe un programa que lea una frase de teclado e
indique si es palíndroma, esto es, que se lee igual de
derecha a izquierda que de izquierda a derecha
sin tener en cuenta los espacios ni las tildes.
 */
public class E33 {
    public static boolean esPalindromo(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length()-1; j <= 0; j--) {
                if (str.charAt(i) != str.charAt(j)){
                    return false ;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la cadena a comparar: ");
        String st = sc.nextLine();
        if (esPalindromo(st)){
            System.out.println("La cadena es un palindromo");
        }else {
            System.out.println("NO es un palindromo");
        }
    }
}
