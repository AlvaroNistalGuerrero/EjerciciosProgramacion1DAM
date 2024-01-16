package Conceptos;

import java.io.IOException;

/*
Diseñar una función que calcule la distancia euclídea entre dos puntos introducidos por teclado, de la forma (x1,y1) e (x2,y2).
 */

public class E22 {

    public static void main(String[] args)throws NumberFormatException, IOException {
        int x2 = 2;
        int x1 = 3;
        int y1 = 4;
        int y2 = 9;

        System.out.println(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

    }


}