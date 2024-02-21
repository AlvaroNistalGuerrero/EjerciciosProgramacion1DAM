package Colecciones2;
/*
Método llamado algunaSeRepiteAlMenos3Veces que acepte una lista de cadenas como parámetro y
retorne verdadero si alguna cadena se repite al menos 3 veces en la lista o falso en caso contrario.
Resolver el problema utilizando un mapa como almacenamiento auxiliar.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class E4 {

    HashMap<Integer,Integer> map = new HashMap<>();
    public void rellenaMapa(ArrayList<Integer> list){
        for (Integer nu: list) {
            if (map.containsKey(nu)){
                int n = map.get(nu);
                map.put(nu,n+1);
            }else{
                map.put(nu,1);

            }
        }
    }
    public int moda(){
        int cont = 0;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            int numero = (Integer) it.next();
            int value = map.get(numero);
            if(value == numero){
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        E4 e = new E4();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(1,5);
        list.add(2,5);
        list.add(3,4);
        System.out.println(e.moda());
    }
}
