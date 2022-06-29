package domaci4;
public class Zadatak1 {


    //https://www.codewars.com/kata/54ff3102c1bad923760001f3/java

    public static int brojSamoglasnika (String s) {
        int suma = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {

                suma++;
            }
        }
        return suma;
    }

    public static void main(String[] args) {

        String s = "ana";
        System.out.println(brojSamoglasnika(s));

    }
}
