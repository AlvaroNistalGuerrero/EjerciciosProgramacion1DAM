package Conceptos;

import java.util.Arrays;

/*
Crear un array bidimensional de tamaño nxm y
rellenarlo de manera que el valor de la posición (n,m) sea n+m.
 */
public class E28 {
    int [][] numeros ;
    public void crearArray(){
        int n = (int) ((Math.random()*10)+1);
        int m = (int) ((Math.random()*10)+1);
        numeros = new int [n][m];
    }
    public void rellenar(){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = i+j;
            }
        }
    }
    public void mostrar(){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length ; j++) {

            }

        }
        System.out.println(Arrays.deepToString(numeros));
    }

    public static void main(String[] args) {
        E28 e = new E28();
        e.crearArray();
        e.rellenar();
        e.mostrar();
    }
}
