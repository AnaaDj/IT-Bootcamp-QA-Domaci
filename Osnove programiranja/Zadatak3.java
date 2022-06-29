package domaci1;

import java.util.Scanner;

public class Zadatak3 {

    // Napisati program koji za unetu godinu proverava da li je pristupna

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite godinu koju zelite da proverite:");
        int godina = scan.nextInt();

        if (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 != 0)) {
            System.out.println("Godina jeste prestupna.");
        }
        else{
            System.out.println("Godina nije prestupna.");}
    }
}
