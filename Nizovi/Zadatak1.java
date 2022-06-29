package domaci3;

import java.util.Scanner;

public class Zadatak1 {

    //Napisati program koji od korisnika traži da unese neki datum i da ispiše koji je to
    // po redu dan u godini. Za izračunavanje definisati i koristiti niz.

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int[] daniUMesecu = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.print("Unesite dan: ");
        int dan = sc.nextInt();

        System.out.print("Unesite mesec: ");
        int mesec = sc.nextInt();

        System.out.print("Uneti godinu: ");
        int godina = sc.nextInt();

        if (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 != 0)) {
            daniUMesecu[1] = 29;
        }

        int suma = 0;

        for (int i = 0; i < mesec - 1; i++) {
            suma += daniUMesecu[i];
        }
        suma +=dan;

        System.out.print("Redni broj dana u godini je: " + suma);


        }
    }

