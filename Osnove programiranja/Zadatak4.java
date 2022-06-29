package domaci1;

import java.util.Scanner;

public class Zadatak4 {

   // Koliko uneti mesec ima dana? (Korisnik unosi mesec 1-12)

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Unesite mesec: (1-12)");
        int m = scn.nextInt();

        System.out.println("Unesite godinu:");
        int year = scn.nextInt();

        if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
            System.out.println("31");
        }
        else if (m==4 || m==6 || m==9 || m==11) {
            System.out.println("30");
        }
        else if (m==2){
            System.out.println("29");
        }
        else {
            System.out.println("Molimo unesite broj izmedju 1 i 12!");
        }


        }


    }

