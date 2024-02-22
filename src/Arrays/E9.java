package Arrays;

public class E9 {
    public static int encontrarCentro(int[] vector) {
        int n = vector.length;
        int[] sumaInicio = new int[n];
        int[] sumaFinal = new int[n];

        sumaInicio[0] = vector[0];
        sumaFinal[n - 1] = vector[n - 1];

        for (int i = 1; i < n; i++) {
            sumaInicio[i] = sumaInicio[i - 1] + vector[i];
            sumaFinal[n - i - 1] = sumaFinal[n - i] + vector[n - i - 1];
        }

        for (int c = 0; c < n; c++) {
            int sumaIzquierda = 0;
            int sumaDerecha = 0;

            for (int i = 0; i < c; i++) {
                sumaIzquierda += (c - i) * vector[i];
            }

            for (int j = c + 1; j < n; j++) {
                sumaDerecha += (j - c) * vector[j];
            }

            if (sumaIzquierda == sumaDerecha) {
                return c;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Ejemplo de un vector de números enteros

        int centro = encontrarCentro(vector);
        if (centro != -1) {
            System.out.println("El centro del vector es el índice: " + centro);
        } else {
            System.out.println("El vector no tiene centro.");
        }
    }
}
