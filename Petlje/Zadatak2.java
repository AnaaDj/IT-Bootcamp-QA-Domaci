package domaci2;

import java.util.Scanner;

public class Zadatak2 {


   //Napisati zbor celih brojeva od N do M (Uključujući oba)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;

        if (n <= m) {
            for (int i = n; i <= m; i++) {
                sum += i;
            }

        }else {
            for (int i = m; i <= n; i++) {
                sum += i;
            }
        }
        System.out.println("Suma je: " + sum);

}
}

