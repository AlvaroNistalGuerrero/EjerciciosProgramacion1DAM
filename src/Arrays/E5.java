package Arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;

public class E5 {
    public static void main(String[] args) {
        int[] numeros = {5, 9, 11, 2, 7, 17, -9, 0, 13, 209, 75, 99, 21};
        String[] strings = {"hola", "adios", "java", "programacion"};

        System.out.println("Valor máximo: " + getMaxValue(numeros));
        System.out.println("Media: " + getAverage(numeros));
        System.out.println("Número de cadenas que contienen 'java': " + countStringsContaining(strings, "java"));
        System.out.println("¿Los dos arrays de strings son iguales?: " + areArraysEqual(strings, strings));
        System.out.println("Intercambio de posiciones en el array de strings: " + Arrays.toString(swapStrings(strings)));
        System.out.println("Rango de valores: " + getRange(numeros));
        System.out.println("Desviación estándar: " + getStandardDeviation(numeros));
        System.out.println("Mínima diferencia entre valores adyacentes: " + getMinAdjacentDifference(numeros));
        System.out.println("Suma de pares de valores: " + Arrays.toString(sumPairs(numeros)));
        System.out.println("Concatenación de arrays: " + Arrays.toString(concatenateArrays(numeros, numeros)));
        System.out.println("Longitud de la subsecuencia más larga ordenada: " + longestOrderedSubsequence(numeros));
    }

    public static int getMaxValue(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }

    public static double getAverage(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }

    public static int countStringsContaining(String[] strings, String target) {
        return (int) Arrays.stream(strings).filter(str -> str.contains(target)).count();
    }

    public static boolean areArraysEqual(String[] array1, String[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static String[] swapStrings(String[] strings) {
        for (int i = 0; i < strings.length - 1; i += 2) {
            String temp = strings[i];
            strings[i] = strings[i + 1];
            strings[i + 1] = temp;
        }
        return strings;
    }

    public static int getRange(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt() - Arrays.stream(numbers).min().getAsInt() + 1;
    }

    public static double getStandardDeviation(int[] numbers) {
        double mean = Arrays.stream(numbers).average().getAsDouble();
        return Math.sqrt(Arrays.stream(numbers).mapToDouble(num -> Math.pow(num - mean, 2)).average().getAsDouble());
    }

    public static int getMinAdjacentDifference(int[] numbers) {
        return Arrays.stream(numbers).reduce((a, b) -> {
            int diff = Math.abs(b - a);
            return Math.min(a, diff);
        }).getAsInt();
    }

    public static int[] sumPairs(int[] numbers) {
        return IntStream.range(0, numbers.length / 2)
                .map(i -> numbers[i * 2] + (i * 2 + 1 < numbers.length ? numbers[i * 2 + 1] : 0))
                .toArray();
    }

    public static String[] concatenateArrays(int[] numbers1, int[] numbers2) {
        return Stream.concat(Arrays.stream(numbers1).mapToObj(String::valueOf), Arrays.stream(numbers2).mapToObj(String::valueOf))
                .toArray(String[]::new);
    }

    public static int longestOrderedSubsequence(int[] numbers) {
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= numbers[i - 1]) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        return Math.max(maxLength, currentLength);
    }
}


