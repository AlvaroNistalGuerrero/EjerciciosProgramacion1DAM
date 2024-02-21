package Colecciones2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*
Método llamado moda que acepte una lista de números enteros como parámetro
y retorne el número que se repite con mayor frecuencia (la moda) o 0 si la lista está vacía.
 */
public class E6 {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int rellenaMapa(ArrayList<Integer> list){
        if (!list.isEmpty()){
            for (Integer n: list) {
                if (map.containsKey(n)){
                    int num = map.get(n);
                    map.put(n,num+1);
                }else{
                    map.put(n,1);

                }
            }
        return 1;
        }
        return 0;
    }
    public String moda(){
        int max = 0;
        int n = 0;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            int numero = (Integer) it.next();
            int value = map.get(numero);
            if(value > max){
                max = value;
                n = numero;

            }
        }
        return "la moda es " + n;
    }

    public static void main(String[] args) {
        E6 e = new E6();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,6);
        list.add(4,6);
        if( e.rellenaMapa(list)==0)
        {
            System.out.println("La moda es "+ 0);
        }else {
            System.out.println(e.moda());
        }


    }
}
