package domaci2;

import java.util.Scanner;

public class Zadatak3 {

    //Napisati program koji ispisuje zbirka svih unetih brojeva dok se ne unese 0

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int suma = 0;

        System.out.println("Unesite broj:");
        n = sc.nextInt();
        suma += n;

        while (n != 0) {
            System.out.println("Zbir je: " + suma + "," + " Unesite sledeci broj ili 0 da izadjete iz programa:");
            n = sc.nextInt();
            suma += n;
        }
        System.out.println("Ukupan zbir je " + suma);

    }

}



