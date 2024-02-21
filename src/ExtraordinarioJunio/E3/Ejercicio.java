package ExtraordinarioJunio.E3;

import java.util.Objects;

public class Ejercicio implements Comparable<Ejercicio>{
    String nombre;
    String musculo;
    int calorias_quemadas;

    public Ejercicio(String nombre, String musculo, int calorias_quemadas) {
        this.nombre = nombre;
        this.musculo = musculo;
        this.calorias_quemadas = calorias_quemadas;
    }

    public Ejercicio() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getMusculo() {
        return musculo;
    }

    public int getCalorias_quemadas() {
        return calorias_quemadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ejercicio ejercicio = (Ejercicio) o;
        return nombre.equals(ejercicio.getNombre());
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, musculo, calorias_quemadas);
    }
    @Override
    public String toString() {
        return "Ejercicio{" +
                "nombre='" + nombre + '\'' +
                ", musculo='" + musculo + '\'' +
                ", calorias_quemadas=" + calorias_quemadas +
                '}';
    }
    @Override
    public int compareTo(Ejercicio e) {
        if(calorias_quemadas==e.getCalorias_quemadas()){
            return getMusculo().compareTo(e.getMusculo());
        }
        return calorias_quemadas-e.getCalorias_quemadas();
    }
}
