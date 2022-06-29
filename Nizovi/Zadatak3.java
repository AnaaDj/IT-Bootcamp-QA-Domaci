package domaci3;

import java.util.Scanner;

public class Zadatak3 {

    // Napisati program koji ce ispisati n brojeva Fibonacijevog niza.

    public static void main(String[] args) {

        System.out.println("Unesite koliko brojeva Fibonacijevog niza zelite da ispisete");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int  prviElNiza = 0, drugiElNiza = 1, treciElNiza = 0;

        while (n <= 0) {
            System.out.println("Greska. broj mora biti ceo i pozitivan. Probajte ponovo");
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            treciElNiza += prviElNiza;
            prviElNiza = drugiElNiza;
            drugiElNiza = treciElNiza;
            System.out.print(treciElNiza + " ");

        }

    }
}

