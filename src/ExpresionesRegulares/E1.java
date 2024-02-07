package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E1 {

    public static boolean validarPalabra(String palabra) {

        String regex = "^[A-Z][a-z]{1,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palabra);
        return matcher.matches();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los nombres separados por comas: ");
        String linea = sc.nextLine();
        String nom[] = linea.split(",");
        if(nom.length >= 2){
            for (int i = 0; i < nom.length; i++) {
                if(validarPalabra(nom[i])){
                    System.out.println(nom[i]);
                }

            }
        }

    }
}
