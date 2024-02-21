package Arrays;

import java.util.Scanner;

public class E3 {
    int [] numeros ;
    //Math.random()*2000001)-1000000;
    public void crearArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un tamaño para el array entre 10 y 1 millon: ");
        int tam = sc.nextInt();
        numeros = new int[tam];
    }
    public void rellenar() {
        long t1 = System.nanoTime();
        long t2 = 0;
        int n;
        int cont = 0;
        while(cont < numeros.length){
            n = (int) (Math.random()*2000001)-1000000;
            if(!buscar(n)){
                numeros[cont] = n;
                cont++;
            }

        }
        t2 = System.nanoTime();
        long tiempo = t2 - t1;
        System.out.println(" El tiempo es : " + tiempo + " nanosegundos");
    }

    private boolean buscar(int n) {
        boolean result = false;
        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i] == n){
                result = true;
            }
        }
        return result;
    }
    public int maximo(){
        int max = 0;
        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        return max;
    }
    public int minimo(){
        int min = 0;
        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] < min){
                min = numeros[i];
            }
        }
        return min;
    }

    public void operacion(int min, int max){
        long t2 = 0;
        long t1 = System.nanoTime();

        int suma = max - min ;

        t2 = System.nanoTime();
        long tiempo = t2 - t1;

        System.out.println("La difreencia entre el maximo y el minimo es : " + suma +
                "\n y ha durado " + tiempo + "nanosegundos");
    }

    public void mostar() {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        E3 e = new E3();
        e.crearArray();
        e.rellenar();
        e.mostar();
        System.out.println(" El tamaño del vector es : "+ e.numeros.length);
        e.operacion(e.minimo(), e.maximo());
    }
}
