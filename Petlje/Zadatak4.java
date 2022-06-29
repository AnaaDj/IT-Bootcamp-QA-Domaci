package domaci2;

import java.util.Scanner;

public class Zadatak4 {

    // FizzBuzzRazzZazz

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite vrednost:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if (i % 3== 0)
                System.out.print("Fizz");
            if (i % 5 == 0)
                System.out.print("Buzz");
            if (i % 7 == 0)
                System.out.print("Fazz");
            if (i % 11 == 0)
                System.out.print("Razz");

        }

    }
}
