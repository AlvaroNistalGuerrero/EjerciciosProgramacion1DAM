package ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E2 {

    public static boolean validarFecha(String fecha){
        String regex = "^(\\d{2}[/\\-])([a-zA-Z]{3}|\\d{2})[/\\-]\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String fecha = "01/09/2021";
        String fecha2 = "01/ene/2021";
        if(validarFecha(fecha)){
            System.out.println("Fecha valida");

        }else {
            System.out.println("Fecha incorrecta");
        }
    }
}
