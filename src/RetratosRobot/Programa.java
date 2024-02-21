
package RetratosRobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa {

    public static void main(String[] args) throws IOException {
        final String PELO01 = "WWWWWWWWW";
        final String PELO2 = "\\\\\\//////";
        final String PELO3 = "|\"\"\"\"\"\"\"|";
        final String PELO4 = "|||||||||";
        final String OJOS1 = "|  O O  |";
        final String OJOS2 = "|-(· ·)-|";
        final String OJOS3 = "|-(o o)-|";
        final String OJOS4 = "|  \\ /  |";
        final String NARIZ1 = "@   J   @";
        final String NARIZ2 = "{   \"   }";
        final String NARIZ3 = "[   j   ]";
        final String NARIZ4 = "<   -   >";
        final String BOCA1 = "|  ===  |";
        final String BOCA2 = "|   -   |";
        final String BOCA3 = "|  ___  |";
        final String BOCA4 = "|  ---  |";
        final String BARBILLA1 = " \\_____/ ";
        final String BARBILLA2 = " \\,,,,,/ ";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Vamos a crear un retrato robot");

        System.out.println("Opciones para el pelo:");
        System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\nElige un número:", PELO01, PELO2, PELO3, PELO4);
        int pelo = Integer.parseInt(in.readLine());
        if (pelo < 1 || pelo > 4)
            System.out.println("Opción incorrecta");
        else {
            System.out.println("Opciones para los ojos:");
            System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\nElige un número:", OJOS1, OJOS2, OJOS3, OJOS4);
            int ojos = Integer.parseInt(in.readLine());
            if (ojos < 1 || ojos > 4)
                System.out.println("Opción incorrecta");
            else {
                System.out.println("Opciones para la nariz y orejas:");
                System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\nElige un número:", NARIZ1, NARIZ2, NARIZ3, NARIZ4);
                int nariz = Integer.parseInt(in.readLine());
                if (nariz < 1 || nariz > 4)
                    System.out.println("Opción incorrecta");
                else {
                    System.out.println("Opciones para la boca:");
                    System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\nElige un número:", BOCA1, BOCA2, BOCA3, BOCA4);
                    int boca = Integer.parseInt(in.readLine());
                    if (boca < 1 || boca > 4)
                        System.out.println("Opción incorrecta");
                    else {
                        System.out.println("Opciones para la barbilla:");
                        System.out.printf("1. %s\n2. %s\nElige un número:", BARBILLA1, BARBILLA2);
                        int barbilla = Integer.parseInt(in.readLine());
                        if (barbilla < 1 || barbilla > 2)
                            System.out.println("Opción incorrecta");
                        else {
                            switch (pelo) {
                                case 1:
                                    System.out.println(PELO01);
                                    break;
                                case 2:
                                    System.out.println(PELO2);
                                    break;
                                case 3:
                                    System.out.println(PELO3);
                                    break;
                                default:
                                    System.out.println(PELO4);
                            }
                            switch (ojos) {
                                case 1:
                                    System.out.println(OJOS1);
                                    break;
                                case 2:
                                    System.out.println(OJOS2);
                                    break;
                                case 3:
                                    System.out.println(OJOS3);
                                    break;
                                default:
                                    System.out.println(OJOS4);
                            }
                            switch (nariz) {
                                case 1:
                                    System.out.println(NARIZ1);
                                    break;
                                case 2:
                                    System.out.println(NARIZ2);
                                    break;
                                case 3:
                                    System.out.println(NARIZ3);
                                    break;
                                default:
                                    System.out.println(NARIZ4);
                            }
                            switch (boca) {
                                case 1:
                                    System.out.println(BOCA1);
                                    break;
                                case 2:
                                    System.out.println(BOCA2);
                                    break;
                                case 3:
                                    System.out.println(BOCA3);
                                    break;
                                default:
                                    System.out.println(BOCA4);
                            }
                            switch (barbilla) {
                                case 1:
                                    System.out.println(BARBILLA1);
                                    break;
                                default:
                                    System.out.println(BARBILLA2);
                            }
                        }
                    }
                }
            }
        }
    }
}
	

	