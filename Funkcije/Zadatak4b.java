package domaci4;

public class Zadatak4b {


    // Proverava da li niz ima duplikata

    public static int duplikati (int[]niz) {

        int brojDuplikata = 0;
        for (int i = 0; i < niz.length; i++) {
            for (int j = i+1; j < niz.length; j++) {
                if (niz[i] == niz[j]) {
                    brojDuplikata++;

                }
            }
        }
        return brojDuplikata;

    }

    public static void main(String[] args) {

        int[] niz = {1,1,1,1};
        System.out.println(duplikati(niz));

    }
}



