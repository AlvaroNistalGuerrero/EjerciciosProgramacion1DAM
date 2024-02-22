package ExtraordinarioJunio.E3;

public class Main {
    public static void main(String[] args) {
        TablaEjercicios t = new TablaEjercicios();
        Ejercicio e = new Ejercicio("Hugin","Baiceps",5000);
        Ejercicio e2 = new Ejercicio("saul","Cuatri",100);
        Ejercicio e3 = new Ejercicio("saul","Zuatri",100);
        t.agregaEjercicio(e);
        t.agregaEjercicio(e2);
        t.agregaEjercicio(e3);
        System.out.println(t.retornaEjerciciosInmutableOrdenacion());
    }
}
