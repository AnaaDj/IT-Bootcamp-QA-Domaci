package domaci6;


public class Student {
    private String imeIPrezime;
    private String brojIndeksa;
    private String smer;
    private int rezultat;
    private static int maxBodova = 100;


    public Student (String imeIPrezime, String brojIndeksa,String smer,int rezultat){
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.smer = smer;
        this.rezultat = rezultat;


    }

    public Student () {
        this.imeIPrezime = "";
        this.brojIndeksa = "";
        this.smer = "";
        this.rezultat = 0;

    }


    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }

    public double getRezultati() {
        return rezultat;
    }

    public void setRezultati(int rezultati) {
        this.rezultat = rezultati;
    }


    public String prolaznost () {
        if(rezultat < maxBodova/2+1) {
            return "Niste polozili ispit";
        }else
            return "Polozili ste ispit";
    }

    @Override
    public String toString(){
        String ispis = "Student: ".concat(this.imeIPrezime).concat("\n");
        ispis = ispis.concat("Broj indeksa: ").concat(this.brojIndeksa).concat("\n");
        ispis = ispis.concat("Smer: ").concat(this.smer).concat("\n");
        ispis = ispis.concat("Rezultat ispita: ").concat(String.valueOf(this.rezultat)).concat("%").concat("\n");
        ispis = ispis.concat(prolaznost());
        return ispis;
    }


}
