package Conceptos;

import java.util.Scanner;

/*
Construir un programa que calcule el perímetro
y el área de ana circunferencia leyendo su radio por teclado. (π = 3.14159)
 */
public class E6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el radio de la circunferencia");
        double linea = sc.nextDouble();
        double r = linea;
        double area = Math.PI * (Math.pow(r, 2));
        System.out.println("El area de la circunferencia es: " + area );
        double perimetro = 2 * Math.PI * r;
        System.out.print("El perimetro de la circnferencia es: " + perimetro);

    }
}
