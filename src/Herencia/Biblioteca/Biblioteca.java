package Herencia.Biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        // Ejemplo de uso
        Publicacion publicacion1 = new Libro(1, "El libro de Alvaro", 2024, "Alvaro");
        Publicacion publicacion2 = new Revista(2, "La revista de Saul", 2025, 5, 10, 2025);

        System.out.println(publicacion1);
        System.out.println(publicacion2);
    }
}
