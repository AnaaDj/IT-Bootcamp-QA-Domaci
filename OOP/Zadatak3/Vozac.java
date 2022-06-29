package Domaci8.Zadatak1;

public class Vozac extends Covek{

    private  String  zanimanje;


    public Vozac(String ime, String prezime, String zanimanje) {
        super(ime, prezime);
        this.zanimanje = zanimanje;
    }

    public Vozac(String zanimanje) {
        zanimanje = "Sofer";
    }


    public String getZanimanje() {
        return zanimanje;
    }


}
