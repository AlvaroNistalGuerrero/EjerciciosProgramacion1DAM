package ExtraordinarioJunio.E3;

import java.util.Iterator;
import java.util.TreeSet;

public class TablaEjercicios {
    TreeSet<Ejercicio> ejercicios = new TreeSet<Ejercicio>();

    public boolean agregaEjercicio(Ejercicio e) {
        return ejercicios.add(e);
    }

    public boolean eliminaEjercicio(String nombre_a_borrar) {
        Iterator it = ejercicios.iterator();
        while (it.hasNext()) {
            Ejercicio e = (Ejercicio) it.next();
            if (nombre_a_borrar.equals(e.getNombre())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public Ejercicio retornaEjercicioTabla(String nombre_busqueda) {

        for (Ejercicio ejer : ejercicios) {
            if (nombre_busqueda.equals(ejer.getNombre())) {
            }
            return ejer;
        }
        return null;
    }
//    public Ejercicio retornaEjercicioQuemaMasCalorias() {
//       if (ejercicios.isEmpty()){
//           return null;
//       }
//        return ejercicios.getFirst();
//    }
}
