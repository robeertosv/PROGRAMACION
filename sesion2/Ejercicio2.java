package sesion2;

/*
 * Programa que pida un entero n>=0 y calcule el factorial(n).
 */

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un entero igual o mayor que 0");
        int n = scanner.nextInt();
        scanner.close();

        int multiplicatorio = n;
        for(int i =1; i<n; i++) {
            multiplicatorio*=i;
        }

        System.out.println(n+"! = "+multiplicatorio);
    }
}
