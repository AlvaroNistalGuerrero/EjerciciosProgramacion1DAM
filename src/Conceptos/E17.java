package Conceptos;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Escribe un programa que lea el nombre del usuario y a continuación
muestre los segundos y milisegundos que ha tardado en contestar,
con un formato de salida que emplee exactamente 3 dígitos en la parte decimal.
 */
public class E17 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");
        long t1 = System.currentTimeMillis();
        long t2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte su nombre");
        String nom = sc.nextLine();

        t2 = System.currentTimeMillis();
        long tiempo =t2-t1;
        tiempo = (long) (tiempo * 0.001);
        long tiempo_enDecimales = Long.parseLong(df.format(tiempo));
        System.out.println("Su nombre es " + nom + " y ha tardado " + tiempo_enDecimales + " segundos en escribirlo");
    }
}
