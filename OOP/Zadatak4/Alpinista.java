package Domaci8.Zadatak2;

public class Alpinista extends Planinar{

    private int poeni;

    public Alpinista(int identifikacioniBroj, String ime, String prezime, int poeni) {
        super(identifikacioniBroj, ime, prezime);
        this.poeni = poeni;
    }

    public Alpinista() {

    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
    }

    @Override
    public int clanarina() {
        int pocetnaClanarina = 1500;
        int clanarinaSaBenefitima = 1500 - (poeni * 50);
        return clanarinaSaBenefitima;
    }

    @Override
    public String uspesanUspon(Planina p) {
       if (p.getVisina() > 4000 && p.getVisina() < 0) {
           return "Neuspesno";
       }
        return "Uspesno";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alpinista, id: ").append(getIdentifikacioniBroj()).append("\n");
        sb.append("Ime: ").append(getIme()).append(" ").append(getPrezime()).append("\n");
        sb.append("Broj poena: ").append((getPoeni()));
        return sb.toString();
    }

}
