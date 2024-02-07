package ExpresionesRegulares.E3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E3 {
    LinkedList<Compra> lista = new LinkedList<>();
    public static boolean validarFecha(String fecha){
        String regex = "^>>([a-zA-Z]+)<<(\\d+\\.\\d+):(\\d+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();
    }
//    public void compruebaCadena(String linea){
//
//
//
//    }
    public void comprar (String linea){
        String trozos[] = linea.split("<<");
        String nombre = trozos[0].replaceAll("<<","");
        float precio = Float.parseFloat(trozos[1].split(":")[0]);
        int unidades = Integer.parseInt(trozos[1].split(":")[1]);
        Compra c = new Compra("Mesa", 231.34F,1);
        lista.add(c);
    }

}
