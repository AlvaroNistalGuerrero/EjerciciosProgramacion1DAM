package Conceptos;
/*
Escribe un programa que muestre en la consola la división de 1234 entre 532,
siendo ambos números reales. El resultado se mostrará con un máximo de 15 dígitos,
de los cuales dos se utilizarán para la parte decimal.
 */

public class E2 {
    private static float n1 = 1234;
    private static float n2 = 532;


    public static void main(String[] args) {
        float suma = n1/n2;
        System.out.printf("%nEl resultado es %.15f " , suma);
    }

}