package domaci7;

public class SastojakRecepta extends Sastojak{
    private double kolicina;


    public SastojakRecepta (String ime, double cena, double kolicina){
        super(ime,cena);
        this.kolicina = kolicina;
    }

    public SastojakRecepta () {
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;

    }

    public double ukupnaCenaSastojka () {
        return getCena() * getKolicina();
    }



}
