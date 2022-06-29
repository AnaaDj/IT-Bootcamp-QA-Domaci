package domaci1;

import java.util.Scanner;

public class Zadatak1 {

    //Napisati program za pivnicu, koji od korisnika traži da unese broj godina (ceo broj)
    //Ako korisnik ima strogo manje od 18 godina, ponudi mu sok (println)
    //Ako korisnik ima više od 18 godina, ponudi mu pivo


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dobrodosli u pivnicu Zirafa. Koliko imate godina?");
        int brojGodina = s.nextInt();

        if (brojGodina >= 18) {
            System.out.println("Za Vas u ponudi imamo 10 vrsta piva.");
        }
        else if (brojGodina > 0){
            System.out.println("Za Vas u ponudi imamo razlicite vrste sokova.");
        }
        else {
            System.out.println("Uneta vrednost nije ispravna, pokusajte ponovo.");
        }

        }


}


