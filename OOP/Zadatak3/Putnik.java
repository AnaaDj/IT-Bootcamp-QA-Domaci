package Domaci8.Zadatak1;

public class Putnik extends Covek{
    private double novac;


    public Putnik(String ime, String prezime, double novac) {
        super(ime, prezime);
        this.novac = novac;
    }

    public Putnik() {
        novac = 0;
    }

    public double getNovac() {
        return novac;
    }

    public void setNovac(double novac) {
        this.novac = novac;
    }

}
