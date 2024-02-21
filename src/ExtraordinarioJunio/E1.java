package ExtraordinarioJunio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class E1 {
    static HashMap<String,Integer> map = new HashMap<>();
    public static HashMap buscarRepeticiones(String linea){
        int pos = 0;
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            String auxiliar = "";
            if (c == linea.charAt(i+1)){
                pos = i+1;
                auxiliar += c;
                while (pos<linea.length() && linea.charAt(pos) == c){
                    auxiliar += linea.charAt(pos);
                    pos++;
                }
                map.put(auxiliar,i);
                i = pos;
            }
        }
        return map;
    }

    public static void main(String[] args) {
        E1 e = new E1();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(buscarRepeticiones(str));

    }

}
