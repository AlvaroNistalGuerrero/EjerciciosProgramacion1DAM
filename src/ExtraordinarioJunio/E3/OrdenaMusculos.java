package ExtraordinarioJunio.E3;

import java.util.Comparator;
import java.util.Objects;

public class OrdenaMusculos implements Comparator<Ejercicio>{

    @Override
    public int compare(Ejercicio o1, Ejercicio o2) {
        if(Objects.equals(o1.getMusculo(), o2.getMusculo())){
            return o1.getCalorias_quemadas()-o2.getCalorias_quemadas();
        }
        return o1.getMusculo().compareTo(o2.getMusculo());
    }

}
