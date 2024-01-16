package Conceptos;

import java.util.Scanner;

/*
Pedir un número por teclado y dibujar un triángulo rectángulo con asteriscos.
Por ejemplo, con n=4 el triángulo será de la forma
* * * *
* * *
* *
*
 */
public class E20 {
    public void trianguloAsteriscos(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


    }
    public static void main(String[] args) {
        E20 e = new E20();
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el numero");
        int num = sc.nextInt();
        e.trianguloAsteriscos(num);

    }

}
