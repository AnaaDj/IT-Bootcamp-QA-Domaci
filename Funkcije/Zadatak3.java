package domaci4;

public class Zadatak3 {

    // Napisati funkciju koja vraća String ponovljen onoliko puta koliko mi tražimo

    public static String duplicate(String s, int n) {
        String suma = "";
        for (int i = 0; i < n; i++) {
            suma = suma.concat(s);
        }
        return suma;
    }

    public static void main(String[] args) {

        int n = 5;
        String s = "Proba";

        System.out.println(duplicate(s,n));
    }
}