package Colecciones2;

import java.util.HashMap;
import java.util.Iterator;

public class E9 {
    static HashMap<Integer, Integer> mapaAux = new HashMap<>();
    public void valorMenosRepetido(HashMap<String, Integer> personas) {
        Iterator it = personas.keySet().iterator();
        while (it.hasNext()){
            String nombre = (String) it.next();
            int edad = personas.get(nombre);
            if (mapaAux.containsKey(edad)){
                int valor = mapaAux.get(edad);
                valor++;
                mapaAux.put(edad, valor);
            }else{
                mapaAux.put(edad, 1);
            }
        }
        System.out.println(mapaAux);
    }
    public void trata(){
        Iterator it = mapaAux.keySet().iterator();
        while(it.hasNext()){
            int edad = (int) it.next();
            int value = mapaAux.get(edad);

        }
    }

    public static void main(String[] args) {
        E9 e = new E9();
        HashMap<String, Integer> personas = new HashMap<>();
        personas.put("Juan", 33);
        personas.put("Hugo", 29);
        personas.put("Ana", 45);
        personas.put("Luis", 47);
        personas.put("Mario", 33);
        personas.put("Rosa", 29);
        personas.put("Carmen", 33);
        personas.put("Elena", 59);
        personas.put("Benito", 33);
        e.valorMenosRepetido(personas);

}
}