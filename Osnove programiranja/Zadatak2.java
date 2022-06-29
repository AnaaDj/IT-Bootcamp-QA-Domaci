package domaci1;

import java.util.Scanner;

public class Zadatak2 {

    // Da li je vikend?
    // Korisnik unosi broj od 1 do 7 (1 je ponedeljak)
    //Ispisujemo Vikend ili Nije vikend


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite redni broj dana (1-7):");
        int x = sc.nextInt();

        if (x > 0 && x <= 5){
            System.out.println("Nije vikend :(");
        }
        else if (x==6 || x==7) {
            System.out.println("Vikend :)");
        }
        else {
            System.out.println("Nazalost, postoji samo 7 dana u nedelji. Pokusajte ponovo.");
        }
    }
}
