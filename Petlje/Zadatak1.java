package domaci2;

import java.util.Scanner;

public class Zadatak1 {

    //Napisati program koji ispisuje parne prirodne brojeve do unetog broja

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite vrednost:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
