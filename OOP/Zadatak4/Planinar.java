package Domaci8.Zadatak2;

public abstract class Planinar {

    private int identifikacioniBroj;
    private String ime;
    private String prezime;


    public Planinar(int identifikacioniBroj, String ime, String prezime) {
        this.identifikacioniBroj = identifikacioniBroj;
        this.ime = ime;
        this.prezime = prezime;
    }

    public Planinar() {
    }

    public int getIdentifikacioniBroj() {
        return identifikacioniBroj;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public abstract void stampaj();

    public abstract int clanarina();

    public abstract String uspesanUspon(Planina p);

}