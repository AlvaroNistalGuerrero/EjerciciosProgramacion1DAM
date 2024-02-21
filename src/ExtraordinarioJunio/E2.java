package ExtraordinarioJunio;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class E2 {

    public void sentarPersonas(int esperando,Queue<Integer> cola){
        int totalSentadas = 0;
        String resultado ="";
        int resultado2 = 0;
        while (!cola.isEmpty() && esperando>0){
            int sentadas = cola.poll();
            int nPersonasSentar = 4 - sentadas;
            esperando -= nPersonasSentar;
            totalSentadas += nPersonasSentar;
            int personasVagon = nPersonasSentar + sentadas;
            resultado2 += esperando - totalSentadas;
            resultado += personasVagon + " ";

        }
        System.out.println(resultado2);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        E2 e = new E2();
        Queue<Integer> cola = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las personas que hay en la cola: ");
        int esperando = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Introduce los asientos ocupados en cada vagon separados por espacios: ");
        String personas_sentadas = sc.nextLine();

        String[] vagones = personas_sentadas.split(" ");
        for (int i = 0; i < vagones.length; i++) {
            cola.add(Integer.parseInt(vagones[i]));
        }
        System.out.println("El tren parte con " + vagones.length + " vagones");
        e.sentarPersonas(esperando,cola);

    }
}
