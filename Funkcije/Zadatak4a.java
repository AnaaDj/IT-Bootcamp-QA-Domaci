package domaci4;

public class Zadatak4a {


    // Proverava da li niz ima duplikata

    public static boolean duplikati (int[]niz) {

        for (int i = 0; i < niz.length; i++) {
            for (int j = i+1; j < niz.length; j++) {
                if (niz[i] == niz[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int[] niz = {1,2,3,4,3};
        System.out.println(duplikati(niz));

    }
}



