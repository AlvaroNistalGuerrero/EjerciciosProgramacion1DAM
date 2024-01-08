package Conceptos;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
Escribir y ejecutar un programa que imprima el nombre, edad y dirección del alumno.
 */
public class E1 {
    private static String name = "Alvaro";
    private static int age = 20;
    private static String direccion = "C/ San Blas,78 ";

    public static void main(String[] args) {
        System.out.println( "Soy " + name + " tengo " + age + " años y vivo en " + direccion);
    }
}
