package Conceptos;
/*
Escribe un programa que calcule la letra del DNI introducido por teclado sabiendo que tenemos
23 letras en el abecedario y que existe una correspondencia entre letras y números tal que así:
   T R W A G M Y F
   P D X B N J Z S
   Q V H L C K E


 */
import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introudzca el dni por teclado");
        int dni = sc.nextInt();
        char letra ="ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(dni%23);
        System.out.println(letra);
    }
}
