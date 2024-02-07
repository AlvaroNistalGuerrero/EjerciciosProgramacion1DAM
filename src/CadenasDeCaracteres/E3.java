package CadenasDeCaracteres;

import java.util.Scanner;

/*
Escribe un programa que lea líneas hasta que se introduzca en una de ellas
la cadena "fin" sin importar si se hace en mayúsculas o en minúsculas o
en cualquier combinación de ambas. Por cada línea leída,
excepto la última, mostrará cuál es el primer carácter que no se repite.
 */
public class E3 {

    public static char primerNoRepetido(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);

            if (cadena.indexOf(actual, i + 1) == -1 && cadena.indexOf(actual) == i) {
                return actual;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea = "";
        do{
            System.out.println("Introduce la linea");
            String st = sc.nextLine();

            if(!st.contains("fin")) {
                char resultado = primerNoRepetido(linea);
                if (resultado  != '\0'){
                    System.out.println("El primer caracter no repetido es : " + resultado);
                }

            }else{
                System.out.println("se repiten todos los numeros");


            }


        }while(!linea.equals("fin"));

     sc.close();
    }

}
