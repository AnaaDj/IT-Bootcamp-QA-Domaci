package domaci3;

import java.util.Scanner;

public class Zadatak2 {

    //Sah

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj figura za Igraca 1: ");
        int brojFigura1 = sc.nextInt();
        String[] igrac1 = new String[brojFigura1];
        int sumaPrvog = 0;

        System.out.print("Unesite broj figura za Igraca 2: ");
        int brojFigura2 = sc.nextInt();
        String[] igrac2 = new String[brojFigura2];
        int sumaDrugog = 0;

        sc.nextLine();

        System.out.println("Unesite figure za Igraca 1: ");
        for (int i = 0; i < brojFigura1; i++) {
            igrac1[i] = sc.nextLine();
        }

        System.out.println("Unesite figure za Igraca 2: ");
        for (int i = 0; i < brojFigura2; i++) {
            igrac2[i] = sc.nextLine();
        }

        for (int i = 0; i < brojFigura1; i++) {
            if (igrac1[i].equalsIgnoreCase("pesak")) {
                sumaPrvog += 1;
            } else if (igrac1[i].equalsIgnoreCase("lovac")) {
                sumaPrvog += 3;
            } else if (igrac1[i].equalsIgnoreCase("konj")) {
                sumaPrvog += 3;
            } else if (igrac1[i].equalsIgnoreCase("top")) {
                sumaPrvog += 5;
            } else if (igrac1[i].equalsIgnoreCase("kraljica")) {
                sumaPrvog += 12;
            } else {
                System.out.println("Figura ne postoji!");
            }

        }

        for (int i = 0; i < brojFigura2; i++) {
            if (igrac2[i].equalsIgnoreCase("pesak")) {
                sumaDrugog += 1;
            } else if (igrac2[i].equalsIgnoreCase("lovac")) {
                sumaDrugog += 3;
            } else if (igrac2[i].equalsIgnoreCase("konj")) {
                sumaDrugog += 3;
            } else if (igrac2[i].equalsIgnoreCase("top")) {
                sumaDrugog += 5;
            } else if (igrac2[i].equalsIgnoreCase("kraljica")) {
                sumaDrugog += 12;
            } else {
                System.out.println("Figura ne postoji!");
            }

        }
        System.out.println("Figure igraca 1: ");
        for (int i = 0; i < brojFigura1; i++) {
            System.out.print(igrac1[i] + " ");
            System.out.println();
        }
        System.out.println("Suma Igraca 1 je: " + sumaPrvog);

        System.out.println("Figure Igraca 2: ");
        for (int i = 0; i < brojFigura2; i++) {
            System.out.print(igrac2[i] + " ");
            System.out.println();
        }
        System.out.println("Suma Igraca 2 je: " + sumaDrugog);


        if (sumaPrvog > sumaDrugog) {
            System.out.println("Igrac 1 ima bolju poziciju.");
        } else if (sumaDrugog > sumaPrvog) {
            System.out.println("Igrac 2 ima bolju poziciju.");
        } else {
            System.out.println("Igraci su izjednaceni.");
        }

    }
}