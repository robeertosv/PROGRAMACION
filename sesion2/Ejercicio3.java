package sesion2;
/*
 * Programa que pida tres números y diga si pueden ser los lados de un triángulo.
*/
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int a,b,c; // Lados del triángulo

        System.out.println("Dime los 3 lados del triángulo");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Los lados " + a + ", " + b + " y " + c + " forman un triángulo");
        } else {
            System.out.println("Los lados " + a + ", " + b + " y " + c + " no forman un triángulo");
        }

        
    }    
}
