package Arrays;
/*
Programa que realice las tareas siguientes:
•
Crear un vector de números enteros de un tamaño aleatorio comprendido entre 10 y 50 elementos.
•
Llenar el vector con números aleatorios comprendidos entre -100 y 100 sin repetir ninguno.
•
Crear un segundo vector que contenga los elementos del anterior almacenados en orden inverso.
•
Mostrar ambos vectores en la consola.
 */
public class E2 {
    int[] numeros;
    public void crearArray(){
        int tam = (int) ((Math.random()*50-10)+10);
        numeros = new int[tam];
    }
    public void llenarArray(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =  (int) (Math.random()*201-100);
        }
    }
    public void mostrar(){
        for(int num:numeros){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        E2 e = new E2();
        e.crearArray();
        e.llenarArray();
        e.mostrar();
    }
}
