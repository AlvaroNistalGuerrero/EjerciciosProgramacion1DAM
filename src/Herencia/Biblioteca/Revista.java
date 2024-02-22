package Herencia.Biblioteca;

public class Revista extends Publicacion {
    private int numero;
    private int mes;
    private int dia;

    public Revista(int codigo, String titulo, int anioPublicacion, int numero, int mes, int dia) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
        this.mes = mes;
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Revista [" + getCodigo() + ", " + getTitulo() + ", " + getAnioPublicacion() + ", " + numero + ", " + mes + ", " + dia + "]";
    }
}
