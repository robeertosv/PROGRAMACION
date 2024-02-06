package sesion2;

/*
 * Programa que pida un entero y devuelva el número de cifras que lo componen
 */

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un entero y te diré de cuantas cifras está hecho");

        int n = scanner.nextInt();
        scanner.close();

        int cifras = 0;
        while (n != 0) {
            n = n / 10;
            cifras++;
        }
        System.out.println("El número tiene " + cifras + " cifras");

    }
}
