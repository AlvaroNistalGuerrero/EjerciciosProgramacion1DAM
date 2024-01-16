package Conceptos;
/*
Escribir un programa que calcule el producto de los 50 primeros números impares.
 */
public class E15 {
    public static void main(String[] args) {
        int producto = 1;
        for (int i = 1; i <= 101; i += 2) {
            producto = producto * i;
        }
        System.out.println("El resultado del producto es = " + producto);
    }

}
