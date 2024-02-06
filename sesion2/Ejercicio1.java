package sesion2;
/*
 * Programa que pida un entero n>=0 y calcule e imprima ∑i entre 0 y n
 */
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Dime un número mayor que 0");
        int n = scanner.nextInt();
        scanner.close();

        int sumatorio = 0;
        for(int i = 0; i<=n; i++ ) {
            sumatorio+=i;
        }

        System.out.println(sumatorio);
    }
}
