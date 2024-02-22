package Herencia.Biblioteca;

public class Libro extends Publicacion {
    private String autores;
    private boolean prestado;

    public Libro(int codigo, String titulo, int anioPublicacion, String autores) {
        super(codigo, titulo, anioPublicacion);
        this.autores = autores;
        this.prestado = false;
    }

    // Getters y Setters
    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro [" + getCodigo() + ", " + getTitulo() + ", " + getAnioPublicacion() + ", " + autores + ", " + prestado + "]";
    }
}
