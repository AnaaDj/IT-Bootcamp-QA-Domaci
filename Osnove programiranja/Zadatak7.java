package domaci1;

import java.util.Scanner;

public class Zadatak7 {


     /* Napisati program 'Kalkulator'. Korisnik u jednom redu unosi x c y, gde su x i y neka dva broja,
        a c jedan od karaktera '+' '-' '/' '*' '%'.
        U zavisnosti od unetog karaktera ispisati resenje izraza x c y.
      */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Upisite vredosti: ");
        double x = s.nextDouble();
        char c = s.next().charAt(0);
        double y= s.nextDouble();

        double result;

        switch (c) {
            case '+': result = x + y;
                System.out.println("Resenje: " + result);
            break;
            case '-': result = x - y;
                System.out.println("Resenje: " + result);
            break;
            case '*': result = x * y;
                System.out.println("Resenje: " + result);
            break;
            case '/': result = x / y;
                System.out.println("Resenje: " + result);
            break;
            case '%': result = x % y;
                System.out.println("Resenje: " + result);
            break;
            default:
                System.out.println("Pogresan unos, pokusajte ponovo!");
        }

    }
}
