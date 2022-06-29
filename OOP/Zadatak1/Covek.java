package domaci6;

public class Covek {
    private String ime;
    private String prezime;




  public Covek(String ime, String prezime) {
      this.ime = ime;
      this.prezime = prezime;

  }

  public Covek() {
      this.ime = "";
      this.prezime = "";
  }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }




    @Override
    public String toString (){
      String ispisVlasnik = "Vlasnik je: ".concat(ime).concat(" ").concat(prezime).concat("\n");
      ispisVlasnik = ispisVlasnik.concat("Broj godina: ");
      return ispisVlasnik;
    }
}



