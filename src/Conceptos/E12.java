package Conceptos;

import java.util.Scanner;

/*
Calcule la suma de la serie 1/1+1/2+1/3+⋯+1/𝑁 donde el número N se introducirá por teclado.
 */
public class E12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de n");
        int n = 0 ;
        boolean corrector = true;
        do {
            try  {
                n = sc.nextInt();
            }

            catch (NumberFormatException e) {
                corrector = false;
                System.out.println("El valor de n no es válido,introduce el valor de nuevo");
            }
        }while (!corrector);
        double suma = 0;

        for(double i = 1; i <= n; i++)
            suma += 1 / i;
        System.out.printf("Suma = %3.2f", suma);


    }
}
