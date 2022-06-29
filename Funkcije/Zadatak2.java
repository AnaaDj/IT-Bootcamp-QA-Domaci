package domaci4;

import java.util.Scanner;

public class Zadatak2 {

    // Napisati funkciju koja vraća true/false u zavisnosti od toga da li je godina prestupna ili nije

    public static boolean prestupnaGodina (int godina) {
        if (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 != 0)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite godinu: ");
        int godina = sc.nextInt();

        System.out.println(prestupnaGodina(godina));


    }
}
