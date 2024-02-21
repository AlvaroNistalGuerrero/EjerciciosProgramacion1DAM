package Colecciones2;

import java.util.HashMap;
import java.util.Iterator;

public class E8 {
    public void interseccion(HashMap<String, Integer> primero, HashMap<String, Integer> segundo){
        HashMap<String, Integer> interseccion = new HashMap<>();
        Iterator it = primero.keySet().iterator();
        while (it.hasNext()){
            String nombre = (String) it.next();
            int edad = primero.get(nombre);
            if (segundo.containsKey(nombre)){
                interseccion.put(nombre, edad);
            }
        }
        System.out.println(interseccion);
    }

    public static void main(String[] args) {
        E8 e = new E8();
        HashMap<String, Integer> primero = new HashMap<>();
        HashMap<String, Integer> segundo = new HashMap<>();
        primero.put("Fernando", 59);
        primero.put("Manuela", 51);
        primero.put("Ana", 79);
        primero.put("Luis", 36);
        segundo.put("Valentina", 54);
        segundo.put("Ana", 79);
        segundo.put("Luis", 36);
        segundo.put("Pedro", 54);
        e.interseccion(primero, segundo);
}
}