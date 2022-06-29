package domaci1;

import java.util.Scanner;

public class Zadatak6 {

    //Napisati program koji od korisnika trazi dva broja (int ili double, svejedno) i ispisuje veci od njih.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Upisite prvu vrednost: ");
        int x = s.nextInt();
        System.out.println("Upisite drugu vrednost: ");
        int y = s.nextInt();

        if (x > y) {
            System.out.println("Prva vrednost je veca od druge vrednosti.");
        }
        else {
            System.out.println("Druga vrednost je veca od prve vrednosti.");
        }

    }
}
