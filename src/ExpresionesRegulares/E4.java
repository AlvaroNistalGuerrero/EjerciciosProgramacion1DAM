package ExpresionesRegulares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E4 {

    public void lecturacorrecta() throws IOException {
        BufferedReader entrada = new BufferedReader(new FileReader("src/ExpresionesRegulares/html.html"));
        while(entrada.ready()){
            String linea = entrada.readLine();
            if (compruebaHtml(linea)){
                System.out.println("Es correcto, la linea es: " + linea);
            }else {
                System.out.println("casi");
            }
        }
    }
    public static boolean compruebaHtml(String html){
       // String regex = "^[a-z<>/.=\"]+=[(http://)|(https://)][a-z<>/.=\"]+$";
        String regex = "^[a-z<>/.\\s=\"]+=(https://)[a-z<>/.=\\s\"]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        return matcher.matches();
    }


    public static void main(String[] args) throws IOException {
        E4 e = new E4();
        e.lecturacorrecta();
    }
}
