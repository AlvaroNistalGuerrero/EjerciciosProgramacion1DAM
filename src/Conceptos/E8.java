package Conceptos;

/*
 * Escribe un programa que permita convertir las componentes
 * de un color en el espacio RGB a sus componentes en el espacio YIQ,
 * según las expresiones matemáticas siguientes:
 * 𝑦=0,299𝑟+0,587𝑔+0,114𝑏
 * 𝑖=0,596𝑟−0,275𝑔−0,321𝑏
 * 𝑞=0,212𝑟−0,528𝑔+0,311𝑏
 * El usuario introducirá por teclado el valor de cada componente
 * RGB (rojo, verde y azul)
 */

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de r");
        double linea = sc.nextDouble();
        double r = linea;
        System.out.println("Introduce el valor de g");
        linea = sc.nextDouble();
        double g = linea;
        System.out.println("Introduce el valor de b");
        linea = sc.nextDouble();
        double b = linea;
        double y = 0.299 * r + 0.587 * g + 0.114 * b;
        double i = 0.596 * r - 0.275 * g - 0.321 * b;
        double q = 0.212 * r - 0.528 * g + 0.311 * b;
        System.out.println("Los componentes de RGB en el espacio YIQ son:" );
        //System.out.print("( " + y + ", " + i + ", " + q + " )");
        System.out.printf("%n( %3.2f" + ", %3.2f" + ", %3.2f" + " )" , y,i,q);

    }
}
