package Herencia.Biblioteca;

public class Publicacion implements Comparable<Publicacion> {
    private int codigo;
    private String titulo;
    private int anioPublicacion;

    public Publicacion(int codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    @Override
    public int compareTo(Publicacion otraPublicacion) {
        return Integer.compare(this.codigo, otraPublicacion.getCodigo());
    }
    @Override
    public String toString() {
        return "Publicacion [" + codigo + ", " + titulo + ", " + anioPublicacion + "]";
    }
}
