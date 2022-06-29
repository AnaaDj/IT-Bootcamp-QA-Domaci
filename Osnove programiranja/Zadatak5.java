package domaci1;

import java.util.Scanner;

public class Zadatak5 {

    //Korisnik unosi trocifren broj: (pretpostaviti dobar unos)
    //1. Izvući cifre broja i pisati ih korisnika
    //2. Proveriti ispisati da li je broj Armstrongov

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int broj = s.nextInt();

        int stotina = broj / 100;
        int desetica = (broj / 10) % 10;
        int jedinica = broj % 10;

        System.out.println("Cifra stotine je: " + stotina);
        System.out.println("Cifra desetice je: " + desetica);
        System.out.println("Cifra jedinice je: " + jedinica);

        if ((Math.pow(stotina,3) + Math.pow(desetica,3) + Math.pow(jedinica,3)) == broj){
            System.out.println("Broj jeste Armstrongov.");
        }
        else {
            System.out.println("Broj nije Armstrongov.");
        }


    }
}