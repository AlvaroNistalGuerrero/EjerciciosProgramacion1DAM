package Colecciones2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
Método llamado negativosAbajoPositivosArriba que acepte una pila
de números enteros como parámetro y la reorganice para que se queden debajo los
negativos y encima los positivos. Usa una cola como estructura de datos auxiliar para realizar el proceso.
 */
public class E5 {
    Queue<Integer> positivos = new LinkedList<Integer>();
    Queue<Integer> negativos = new LinkedList<Integer>();

    public void negativosAbajoPositivosArriba(Stack<Integer> pila){
        Stack pilafinal = new Stack<>();
        while (!pila.empty()){
            int valor = pila.pop();
            if(valor < 0){
                negativos.add(valor);
            }else {
                positivos.add(valor);
            }

        }
        while (!negativos.isEmpty()){
            int valor = negativos.poll();
            pilafinal.push(valor);
        }
        while (!positivos.isEmpty()){
            int valor = positivos.poll();
            pilafinal.push(valor);
        }

        System.out.println(pilafinal);
    }

    public static void main(String[] args) {
        E5 e = new E5();
        Stack pilafinal = new Stack<>();
        pilafinal.add(3);
        pilafinal.add(-3);
        pilafinal.add(-5);
        pilafinal.add(-6);
        pilafinal.add(9);
        e.negativosAbajoPositivosArriba(pilafinal);
    }
}
