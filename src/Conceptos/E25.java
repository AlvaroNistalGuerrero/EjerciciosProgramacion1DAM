package Conceptos;

import java.util.Scanner;

/*
Escribe un método que introduzca 10 números enteros en un array
y que luego los invierta, colocando el primero en la décima posición,
el segundo en la novena posición, etc…
 */
public class E25 {
    public int[] numeros = new int[10] ;

    public void rellenar(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100+1)-1;
        }
    }
    public void mostrar(int[] numeros){
        for (int numero:numeros) {
            System.out.print(numero + " ");
        }
    }
    public void invertirArray(int[] numeros){
        int sum = 0;
        int fin = numeros.length - 1;
        while(sum < fin){
            int temp = numeros[sum];
            numeros[sum] = numeros [fin];
            numeros[fin] = temp;
            sum++;
            fin--;
        }

    }
    public static void main(String[] args) {
        E25 e = new E25();
        e.rellenar();
        e.mostrar(e.numeros);
        System.out.println();
        e.invertirArray(e.numeros);
        e.mostrar(e.numeros);
    }
}
