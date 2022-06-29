package domaci6;

public class Automobil {

    private Covek vlasnik;
    private String marka;
    private String model;
    private int serijskiBroj;


    private void auto (){
        this.marka = "BMW";
        this.model = "x5";
        this.serijskiBroj = 112233;
    }


    public Automobil (Covek vlasnik) {
        this.vlasnik = new Covek(vlasnik.getIme(), vlasnik.getPrezime());
        auto();

    }

    public Automobil (){
        this.vlasnik = new Covek();
        auto();
    }


    public Covek getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Covek vlasnik) {
        this.vlasnik = new Covek(vlasnik.getIme(), vlasnik.getPrezime());
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }




    @Override
    public String toString(){
        String ispis = "Automobil: ".concat(marka).concat(" ").concat(model).concat ("\n");
        ispis = ispis.concat("Serijski broj: ").concat(String.valueOf(serijskiBroj)).concat("\n");
        ispis = ispis.concat("Vlasnik je: ").concat(vlasnik.getIme()).concat(" ").concat(vlasnik.getPrezime());
        return ispis;
    }


}
