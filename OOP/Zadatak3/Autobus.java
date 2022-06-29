package Domaci8.Zadatak1;

import java.util.ArrayList;

public class Autobus {

    private String naziv;
    private Vozac vozacAutobusa;
    private double cenaKarte;

    private Putnik putnikAutobusa;


    public Autobus(String naziv, Vozac vozacAutobusa, double cenaKarte, Putnik putnikAutobusa) {
        this.naziv = naziv;
        this.vozacAutobusa = vozacAutobusa;
        this.cenaKarte = cenaKarte;
        this.putnikAutobusa = putnikAutobusa;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(double cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public Putnik getPutnikAutobusa() {
        return putnikAutobusa;
    }

    public void setPutnikAutobusa(Putnik putnikAutobusa) {
        this.putnikAutobusa = putnikAutobusa;
    }

    public void dodajPutnika(Putnik p) {
        this.putnikAutobusa = p;

    }

    public void oduzmiPutnika(Putnik p) {
        this.putnikAutobusa = null;
}


    public void dodajVozaca (Vozac v){
        this.vozacAutobusa = v;
    }


    public void obrisiVozaca (Vozac v) {
        this.vozacAutobusa = null;
    }


}