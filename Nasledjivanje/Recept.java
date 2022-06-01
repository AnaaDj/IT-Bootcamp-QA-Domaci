package domaci7;

import java.util.ArrayList;

public class Recept {
    private String nazivRecepta;
    private int tezina;
    private ArrayList<SastojakRecepta> sastojci;


    public Recept(String nazivRecepta, int tezina, ArrayList<SastojakRecepta> sastojci) {
        this.nazivRecepta = nazivRecepta;
        this.tezina = tezina;
        this.sastojci = sastojci;
    }


    public Recept() {
        this.sastojci = new ArrayList<>();
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public ArrayList<SastojakRecepta> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<SastojakRecepta> sastojci) {
        this.sastojci = sastojci;
    }


    public String tezinaNivoa() {
        if (tezina > 0 && tezina < 6) {
            if (tezina == 1) {
                return "Pocetni";
            } else if (tezina == 2) {
                return "Lak";
            } else if (tezina == 3) {
                return "Srednji";
            } else if (tezina == 4) {
                return "Tezak";
            } else
                return "Majstorski";
        }
        return "Nepostojeci";
    }


    public void dodajSastojak(SastojakRecepta sastojak) {
        sastojci.add(sastojak);
    }

    public void dodajSastojak(SastojakRecepta sastojak, int i) {
        sastojci.add(i, sastojak);
    }

    private boolean poredjenje(Sastojak a, Sastojak b) {
        if (a.getNaziv().equalsIgnoreCase(b.getNaziv()) && a.getCena() == b.getCena()) {
            return true;
        }
        return false;
    }


    public void oduzmiSastojak(SastojakRecepta sastojak) {
        for (int i = 0; i < sastojci.size(); i++) {
            Sastojak trenutni = sastojci.get(i);
            if (poredjenje(trenutni, sastojak)) {
                sastojci.remove(i);
                return;
            }
        }
    }

    public void oduzmiSastojak(int i) {
        sastojci.remove(i);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nazivRecepta).append(":").append("\n");
        sb.append("Tezina: ").append(tezinaNivoa()).append(" nivo").append("\n");
        sb.append("Sastojci: ").append("\n");
        for (SastojakRecepta s : sastojci) {
            sb.append(s.getNaziv()).append("\n");
        }
        return sb.toString();
    }

}


