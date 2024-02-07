package Colecciones2;
/*
Método llamado algunaSeRepiteAlMenos3Veces que acepte una lista de cadenas como parámetro y
retorne verdadero si alguna cadena se repite al menos 3 veces en la lista o falso en caso contrario.
Resolver el problema utilizando un mapa como almacenamiento auxiliar.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class E4 {


    public boolean algunaSeRepiteAlMenos3Veces(ArrayList<String> list){
        HashMap<String,Integer> map = new HashMap<>();
        for (String palabra: list) {
            if (map.containsKey(palabra)){
                int n = map.get(palabra);
                map.put(palabra,n+1);
            }else{
                map.put(palabra,1);

            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
