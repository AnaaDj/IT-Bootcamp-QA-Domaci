package domaci7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


    Sastojak brasno = new Sastojak("brasno",0.075);
    SastojakRecepta brasno1 = new SastojakRecepta(brasno.getNaziv(), brasno.getCena(), 1000);

        double ukupno = brasno1.ukupnaCenaSastojka();
        System.out.println(ukupno);
        System.out.println("--------------------");

    SastojakRecepta testenina = new SastojakRecepta("Spagete",70, 200);
    SastojakRecepta meso = new SastojakRecepta("Slanina",200,300);
    SastojakRecepta pavlaka = new SastojakRecepta("Pavlaka",150,200);

    ArrayList <SastojakRecepta> sviSastojci = new ArrayList<>();
    sviSastojci.add(testenina);
    sviSastojci.add(meso);
    sviSastojci.add(pavlaka);

    Recept carbonara = new Recept("Carbonara",3, sviSastojci);
        System.out.println(carbonara);

}

}
