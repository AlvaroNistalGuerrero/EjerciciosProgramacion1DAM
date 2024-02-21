package Colecciones2;

import java.util.Stack;

public class E7 {

    public void eliminarSiMayoresEncima(Stack<Integer> numeros){
        Stack<Integer> pilaFinal = new Stack<>();
        while(!numeros.isEmpty()){
            int arriba = numeros.pop();
            if(!numeros.isEmpty()) {
                int abajo = numeros.peek();
                if (arriba < abajo) {
                    pilaFinal.add(arriba);
                }else {
                    pilaFinal.push(arriba);
                    numeros.pop();
                }
            }
        }
        System.out.println(pilaFinal);
    }

    public static void main(String[] args) {
        E7 e = new E7();
        Stack<Integer> numeros = new Stack<>();
        numeros.add(6);
        numeros.add(22);
        numeros.add(17);
        numeros.add(10);
        numeros.add(7);
        numeros.add(9);
        numeros.add(14);
        numeros.add(5);
        numeros.add(12);
        numeros.add(7);
        numeros.add(2);
        e.eliminarSiMayoresEncima(numeros);
}

}